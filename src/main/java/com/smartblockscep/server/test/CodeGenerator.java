package com.smartblockscep.server.test;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.smartblockscep.server.*;
import com.smartblockscep.server.api.SiddhiApp;
import com.smartblockscep.server.api.definition.Attribute;
import com.smartblockscep.server.api.definition.StreamDefinition;
import com.smartblockscep.server.api.execution.ExecutionElement;
import com.smartblockscep.server.api.execution.query.Query;
import com.smartblockscep.server.api.execution.query.input.handler.Filter;
import com.smartblockscep.server.api.execution.query.input.handler.StreamHandler;
import com.smartblockscep.server.api.execution.query.input.handler.Window;
import com.smartblockscep.server.api.execution.query.input.state.*;
import com.smartblockscep.server.api.execution.query.input.stream.*;
import com.smartblockscep.server.api.execution.query.output.stream.OutputStream;
import com.smartblockscep.server.api.execution.query.selection.OrderByAttribute;
import com.smartblockscep.server.api.execution.query.selection.OutputAttribute;
import com.smartblockscep.server.api.execution.query.selection.Selector;
import com.smartblockscep.server.api.expression.AttributeFunction;
import com.smartblockscep.server.api.expression.Expression;
import com.smartblockscep.server.api.expression.Variable;
import com.smartblockscep.server.api.expression.condition.And;
import com.smartblockscep.server.api.expression.condition.Compare;
import com.smartblockscep.server.api.expression.condition.Or;
import com.smartblockscep.server.api.expression.constant.*;
import com.smartblockscep.server.api.expression.math.*;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CodeGenerator {

    SolidityContract solidityContract = new SolidityContract();

    public String processOutput(SiddhiApp siddhiApp, int precision) {
       // System.out.println(siddhiApp);

        // process stream definition
        Map<String, StreamDefinition> streamDefinitionMap = siddhiApp.getStreamDefinitionMap();
        processStreamDefinition(streamDefinitionMap);

        //process execution element list
        List<ExecutionElement> executionElementList = siddhiApp.getExecutionElementList();
        for (ExecutionElement executionElement : executionElementList) {
            if (executionElement instanceof Query) {
                Query query = (Query) executionElement;

                // handle input stream
                InputStream inputStream = query.getInputStream();
                processInputStream(inputStream);
                System.out.println(query);


                // handle selector
                Selector selector = query.getSelector();
                processSelector(selector);

                // handle output stream
                OutputStream outputStream = query.getOutputStream();
                solidityContract.setOutputStreamName(outputStream.getId());
            }
        }

        Mustache m;

        if(solidityContract.getQueryType() == QueryType.SlidingWindow){
            MustacheFactory mf = new DefaultMustacheFactory();
            m = mf.compile("SlidingWindowContract.mustache");
        }
        else if(solidityContract.getQueryType() == QueryType.Block){
            MustacheFactory mf = new DefaultMustacheFactory();
            m = mf.compile("BlockWindowContract.mustache");
        }
        else {
            MustacheFactory mf = new DefaultMustacheFactory();
            m = mf.compile("SolidityContract.mustache");
        }


        String output = "";

        try {
            StringWriter writer = new StringWriter();
            m.execute(writer, solidityContract).flush();
            output = writer.toString();
        } catch (Exception e) {

        }
        return output;
    }

    private void processStreamDefinition(Map<String, StreamDefinition> streamDefinitionMap) {

        List<InputStreamEvent> inputStreamEventList = new ArrayList<>();

        //todo implement a better way to get output attribute types
        //List<StreamAttribute> streamAttributeList = new ArrayList<>();

        for (Map.Entry<String, StreamDefinition> stringStreamDefinitionEntry : streamDefinitionMap.entrySet()) {

            StreamDefinition streamDefinition = stringStreamDefinitionEntry.getValue();

            InputStreamEvent inputStreamEvent = new InputStreamEvent();

            inputStreamEvent.setInputStreamName(streamDefinition.getId());

            List<Attribute> attributeList = streamDefinition.getAttributeList();
            List<StreamAttribute> moderatedInputAttributes = new ArrayList<>();

            for (Attribute attribute : attributeList) {
                StreamAttribute streamAttribute = new StreamAttribute();
                streamAttribute.setName(attribute.getName());
                streamAttribute.setType(getAttributeType(attribute.getType()));

                moderatedInputAttributes.add(streamAttribute);

                //todo implement a better way to get output attribute types
                // streamAttributeList.add(streamAttribute);
            }

            inputStreamEvent.setStreamAttributeList(moderatedInputAttributes);
            inputStreamEventList.add(inputStreamEvent);
        }
        // todo implement a better way to get output attribute types
        // smartContract.setAttributes(streamAttributeList);

        solidityContract.setInputStreamEventList(inputStreamEventList);
    }

    private void processInputStream(InputStream inputStream) {
        // System.out.println(inputStream);
        if (inputStream instanceof JoinInputStream) {
            //System.out.println(inputStream);
            InputStream leftInputStream = ((JoinInputStream) inputStream).getLeftInputStream();
            //System.out.println("leftInputStream");
            //System.out.println(leftInputStream);

            InputStream rightInputStream = ((JoinInputStream) inputStream).getRightInputStream();
            // System.out.println("rightInputStream");
            // System.out.println(rightInputStream);
            // todo implement logic for join input stream

        } else if (inputStream instanceof SingleInputStream) {
            SingleInputStream singleInputStream = (SingleInputStream) inputStream;

            List<StreamHandler> streamHandlerList = singleInputStream.getStreamHandlers();
            String singleInputStreamStreamId = singleInputStream.getStreamId();
            for (StreamHandler streamHandler : streamHandlerList) {
                if (streamHandler instanceof Filter) {
                    Filter filter = (Filter) streamHandler;
                    processFilter(filter, singleInputStreamStreamId);

                } else if (streamHandler instanceof Window) {
                    Window window = (Window) streamHandler;
                    System.out.println(window.getFunction());
                    if(window.getFunction().equals("lengthBatch")){
                        solidityContract.setQueryType(QueryType.BatchWindow);
                    }
                    else if(window.getFunction().equals("block")){
                        solidityContract.setQueryType(QueryType.Block);
                    }
                    else {
                        solidityContract.setQueryType(QueryType.SlidingWindow);
                    }
                    processWindow(window, singleInputStreamStreamId);
                }
            }

        } else if (inputStream instanceof StateInputStream) {

            StateInputStream stateInputStream = (StateInputStream) inputStream;
            StateInputStream.Type type = stateInputStream.getStateType();

            if (type.equals(StateInputStream.Type.PATTERN)) {
                // System.out.println(stateInputStream);

                StateElement stateElement = stateInputStream.getStateElement();
                TimeConstant timeConstant = stateInputStream.getWithinTime();

                SequenceExpression sequenceExpression = new SequenceExpression();
                solidityContract.addSequenceExpression(sequenceExpression);
                processStateElement(stateElement, sequenceExpression);

            } else if (type.equals(StateInputStream.Type.SEQUENCE)) {
                // System.out.println(stateInputStream.getWithinTime());
                SequenceExpression sequenceExpression = new SequenceExpression();
                solidityContract.addSequenceExpression(sequenceExpression);
                StateElement stateElement = stateInputStream.getStateElement();
                processStateElement(stateElement, sequenceExpression);
            }
        }
    }

    private void processStateElement(StateElement stateElement, SequenceExpression sequenceExpression) {
        //System.out.println(stateElement);
        if (stateElement instanceof NextStateElement) {
            NextStateElement nextStateElement = (NextStateElement) stateElement;
            // get state element
            StateElement stateElement1 = nextStateElement.getStateElement();
            processStateElement(stateElement1, sequenceExpression);
            StateElement stateElement2 = nextStateElement.getNextStateElement();
            processStateElement(stateElement2, sequenceExpression);
        } else if (stateElement instanceof EveryStateElement) {
            EveryStateElement everyStateElement = (EveryStateElement) stateElement;
            processEveryStateElement(everyStateElement, sequenceExpression);
        } else if (stateElement instanceof StreamStateElement) {
            StreamStateElement streamStateElement = (StreamStateElement) stateElement;
            processStreamStateElement(streamStateElement, sequenceExpression);

        } else if (stateElement instanceof CountStateElement) {
            CountStateElement countStateElement = (CountStateElement) stateElement;
            processCountStateElement(countStateElement,sequenceExpression);

        } else if (stateElement instanceof LogicalStateElement) {
            LogicalStateElement logicalStateElement = (LogicalStateElement) stateElement;
            processLogicalStateElemet(logicalStateElement, sequenceExpression);
        }
    }

    public void processLogicalStateElemet(LogicalStateElement logicalStateElement, SequenceExpression sequenceExpression) {
        LogicalStateElement.Type logicalStateElementType = logicalStateElement.getType();

        StreamStateElement streamStateElement1 = logicalStateElement.getStreamStateElement1();
        StreamStateElement streamStateElement2 = logicalStateElement.getStreamStateElement2();

        BasicSingleInputStream basicSingleInputStream1 = streamStateElement1.getBasicSingleInputStream();
        String singleInputStreamStreamId1 = basicSingleInputStream1.getStreamId();
        String singleInputStreamStreamReferenceId1 = basicSingleInputStream1.getStreamReferenceId();
        List<StreamHandler> streamHandlerList1 = basicSingleInputStream1.getStreamHandlers();

        InitialInputStream initialInputStream1 = new InitialInputStream();
        initialInputStream1.setName(singleInputStreamStreamId1);
        initialInputStream1.setReferenceId(singleInputStreamStreamReferenceId1);
        sequenceExpression.addInputStreamName(initialInputStream1);
        solidityContract.addInputStreamName(initialInputStream1);

        String expression1 = "";
        for (StreamHandler streamHandler : streamHandlerList1) {
            if (streamHandler instanceof Filter) {
                Filter filter = (Filter) streamHandler;
                Expression[] expressions = filter.getParameters();
                for (Expression expression : expressions) {
                    expression1 = getFilterSequence(expression, "initial" + singleInputStreamStreamId1, sequenceExpression);

                }

            }
        }

        BasicSingleInputStream basicSingleInputStream2 = streamStateElement2.getBasicSingleInputStream();
        String singleInputStreamStreamId2 = basicSingleInputStream2.getStreamId();
        String singleInputStreamStreamReferenceId2 = basicSingleInputStream2.getStreamReferenceId();
        List<StreamHandler> streamHandlerList2 = basicSingleInputStream2.getStreamHandlers();

        InitialInputStream initialInputStream2 = new InitialInputStream();
        initialInputStream2.setName(singleInputStreamStreamId2);
        initialInputStream2.setReferenceId(singleInputStreamStreamReferenceId2);
        sequenceExpression.addInputStreamName(initialInputStream2);
        solidityContract.addInputStreamName(initialInputStream2);

        String expression2 = "";
        for (StreamHandler streamHandler : streamHandlerList2) {
            if (streamHandler instanceof Filter) {
                Filter filter = (Filter) streamHandler;
                Expression[] expressions = filter.getParameters();
                for (Expression expression : expressions) {
                    expression2 = getFilterSequence(expression, "initial" + singleInputStreamStreamId2, sequenceExpression);
                }

            }
        }
        if (expression1.equals("")) {
            expression1 = "incoming" + singleInputStreamStreamId1 + "Event";
        }
        if (expression2.equals("")) {
            expression2 = "incoming" + singleInputStreamStreamId2 + "Event";
        }

        String type = "";
        if (logicalStateElementType.equals(LogicalStateElement.Type.AND)) {
            type = " && ";
        } else if (logicalStateElementType.equals(LogicalStateElement.Type.OR)) {
            type = " || ";
        }

        String logicalExpression = "(" + expression1 + type + expression2 + ")";
        setExpression(sequenceExpression, logicalExpression);


    }

    public void processEveryStateElement(EveryStateElement everyStateElement, SequenceExpression sequenceExpression) {
        StateElement stateElement = everyStateElement.getStateElement();
        if (stateElement instanceof StreamStateElement) {
            StreamStateElement streamStateElement = (StreamStateElement) stateElement;
            BasicSingleInputStream basicSingleInputStream = streamStateElement.getBasicSingleInputStream();
            String singleInputStreamStreamId = basicSingleInputStream.getStreamId();
            String singleInputStreamStreamReferenceId = basicSingleInputStream.getStreamReferenceId();
            List<StreamHandler> streamHandlerList = basicSingleInputStream.getStreamHandlers();

            InitialInputStream initialInputStream = new InitialInputStream();
            initialInputStream.setName(singleInputStreamStreamId);
            initialInputStream.setReferenceId(singleInputStreamStreamReferenceId);
            initialInputStream.setInitial(true);
            sequenceExpression.addInputStreamName(initialInputStream);
            solidityContract.addInputStreamName(initialInputStream);

            for (StreamHandler streamHandler : streamHandlerList) {
                if (streamHandler instanceof Filter) {
                    Filter filter = (Filter) streamHandler;
                    Expression[] expressions = filter.getParameters();
                    for (Expression expression : expressions) {
                        String output = getFilterSequence(expression, "initial" + singleInputStreamStreamId, sequenceExpression);
                        initialInputStream.setExpression(output);
                        setExpression(sequenceExpression, output);

                    }

                }
            }
            sequenceExpression.setInitialStreamName(initialInputStream);


        }
    }

    public void setExpression(SequenceExpression sequenceExpression, String expression) {
        if (sequenceExpression.getExpression().equals("")) {
            sequenceExpression.setExpression(expression);
        } else {
            String newExpression = sequenceExpression.getExpression() + " && " + expression;
            sequenceExpression.setExpression(newExpression);
        }
    }

    public void processCountStateElement(CountStateElement countStateElement,SequenceExpression sequenceExpression) {
        StreamStateElement streamStateElement = countStateElement.getStreamStateElement();
        int maxCount = countStateElement.getMaxCount();
        int minCount = countStateElement.getMinCount();
        System.out.println(maxCount);
        System.out.println(minCount);
        BasicSingleInputStream basicSingleInputStream = streamStateElement.getBasicSingleInputStream();
        String singleInputStreamStreamId = basicSingleInputStream.getStreamId();
        String singleInputStreamStreamReferenceId = basicSingleInputStream.getStreamReferenceId();

        InitialInputStream initialInputStream = new InitialInputStream();
        initialInputStream.setName(singleInputStreamStreamId);
        initialInputStream.setReferenceId(singleInputStreamStreamReferenceId);
        sequenceExpression.addInputStreamName(initialInputStream);
        solidityContract.addInputStreamName(initialInputStream);

        List<StreamHandler> streamHandlerList = basicSingleInputStream.getStreamHandlers();

        for (StreamHandler streamHandler : streamHandlerList) {
            if (streamHandler instanceof Filter) {
                Filter filter = (Filter) streamHandler;
                Expression[] expressions = filter.getParameters();
                for (Expression expression : expressions) {
                    String output = getFilterSequence(expression, "incoming" + singleInputStreamStreamId, sequenceExpression);
                    initialInputStream.setExpression(output);
                    setExpression(sequenceExpression, output);

                }

            }
        }
    }

    private void processStreamStateElement(StreamStateElement streamStateElement, SequenceExpression sequenceExpression) {
        BasicSingleInputStream basicSingleInputStream = streamStateElement.getBasicSingleInputStream();
        String singleInputStreamStreamId = basicSingleInputStream.getStreamId();
        String singleInputStreamStreamReferenceId = basicSingleInputStream.getStreamReferenceId();

        InitialInputStream initialInputStream = new InitialInputStream();
        initialInputStream.setName(singleInputStreamStreamId);
        initialInputStream.setReferenceId(singleInputStreamStreamReferenceId);
        sequenceExpression.addInputStreamName(initialInputStream);
        solidityContract.addInputStreamName(initialInputStream);
        List<StreamHandler> streamHandlerList = basicSingleInputStream.getStreamHandlers();

        for (StreamHandler streamHandler : streamHandlerList) {
            if (streamHandler instanceof Filter) {
                Filter filter = (Filter) streamHandler;
                Expression[] expressions = filter.getParameters();
                for (Expression expression : expressions) {
                    String output = getFilterSequence(expression, "incoming" + singleInputStreamStreamId, sequenceExpression);
                    initialInputStream.setExpression(output);
                    setExpression(sequenceExpression, output);

                }

            }
        }
    }

    public String getFilterSequence(Expression expression, String streamId, SequenceExpression sequenceExpression) {
        String event = streamId + "Event.";
        String filterExpression = "";
        if (expression instanceof And) {
            And andExpression = (And) expression;
            String leftExpression = getFilterSequence(andExpression.getLeftExpression(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(andExpression.getRightExpression(), streamId, sequenceExpression);

            return "(" + leftExpression + " && " + rightExpression + ")";
        } else if (expression instanceof Or) {
            Or orExpression = (Or) expression;
            String leftExpression = getFilterSequence(orExpression.getLeftExpression(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(orExpression.getRightExpression(), streamId, sequenceExpression);

            return "(" + leftExpression + " || " + rightExpression + ")";
        } else if (expression instanceof Compare) {
            Compare compareExpression = (Compare) expression;
            String leftExpression = getFilterSequence(compareExpression.getLeftExpression(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(compareExpression.getRightExpression(), streamId, sequenceExpression);
            String operatorString = getOperatorString(compareExpression.getOperator());
            return "(" + leftExpression + " " + operatorString + " " + rightExpression + ")";

        } else if (expression instanceof BoolConstant) {
            BoolConstant boolExpression = (BoolConstant) expression;
            return "" + boolExpression.getValue();

        } else if (expression instanceof DoubleConstant) {
            DoubleConstant doubleExpression = (DoubleConstant) expression;
            return "" + doubleExpression.getValue();

        } else if (expression instanceof FloatConstant) {
            FloatConstant constant = (FloatConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof IntConstant) {
            IntConstant constant = (IntConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof LongConstant) {
            LongConstant constant = (LongConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof StringConstant) {
            StringConstant constant = (StringConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof Variable) {
            Variable constant = (Variable) expression;
            if (constant.getStreamId() == null) {
                return event + constant.getAttributeName();
            } else {
                List<InitialInputStream> initialInputStreams = sequenceExpression.getInputStreamNames();
                for (InitialInputStream initialInputStream : initialInputStreams) {
                    if (initialInputStream.getReferenceId().equals(constant.getStreamId())) {
                        if (initialInputStream.isInitial()) {
                            return "initial" + initialInputStream.getName() + "Event." + constant.getAttributeName();
                        } else {
                            return "incoming" + initialInputStream.getName() + "Event." + constant.getAttributeName();
                        }
                    }
                }

            }
        } else if (expression instanceof Add) {
            Add addExpression = (Add) expression;
            String leftExpression = getFilterSequence(addExpression.getLeftValue(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(addExpression.getRightValue(), streamId, sequenceExpression);
            return "(" + leftExpression + " + " + rightExpression + ")";
        } else if (expression instanceof Subtract) {
            Subtract subtract = (Subtract) expression;
            String leftExpression = getFilterSequence(subtract.getLeftValue(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(subtract.getRightValue(), streamId, sequenceExpression);
            return "(" + leftExpression + " - " + rightExpression + ")";
        } else if (expression instanceof Multiply) {
            Multiply multiply = (Multiply) expression;
            String leftExpression = getFilterSequence(multiply.getLeftValue(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(multiply.getRightValue(), streamId, sequenceExpression);
            return "(" + leftExpression + " * " + rightExpression + ")";
        } else if (expression instanceof Divide) {
            Divide divide = (Divide) expression;
            String leftExpression = getFilterSequence(divide.getLeftValue(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(divide.getRightValue(), streamId, sequenceExpression);
            return "(" + leftExpression + "/" + rightExpression + ")";
        } else if (expression instanceof Mod) {
            Mod mod = (Mod) expression;
            String leftExpression = getFilterSequence(mod.getLeftValue(), streamId, sequenceExpression);
            String rightExpression = getFilterSequence(mod.getRightValue(), streamId, sequenceExpression);
            return "(" + leftExpression + "%" + rightExpression + ")";
        }

        return filterExpression;
    }

    private void processSelector(Selector selector) {
        // get selection list
        List<OutputAttribute> outputAttributeList = selector.getSelectionList();
        processOutputAttributeList(outputAttributeList);

        // get groupBy list
        List<Variable> variableList = selector.getGroupByList();

        // get having expression
        Expression expression = selector.getHavingExpression();
        
        System.out.println(getFilterExpression(expression,"window"));
        //get orderBy list
        List<OrderByAttribute> orderByAttributeList = selector.getOrderByList();

        // get limit
        Constant limit = selector.getLimit();

        // get offset
        Constant offset = selector.getOffset();
    }

    private void processOutputAttributeList(List<OutputAttribute> outputAttributeList) {

        List<StreamOutputAttribute> moderatedOutputAttributes = new ArrayList<>();

        for (OutputAttribute outputAttribute : outputAttributeList) {

            Expression expression = outputAttribute.getExpression();
            if (expression instanceof AttributeFunction) {
                List<WindowFunction> windowFunctionList = new ArrayList<>();
                StreamOutputAttribute streamAttribute = new StreamOutputAttribute();
                AttributeFunction attributeFunction = (AttributeFunction) expression;
                String functionName = attributeFunction.getName();

                WindowFunction windowFunction = new WindowFunction();
                switch (functionName) {
                    case "avg": {
                        AverageFunction averageFunction = new AverageFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        averageFunction.setFunctionName(functionName + variable.getAttributeName());
                        averageFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

                        List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();
                        List<StreamAttribute> streamAttributeList = inputStreamEventList.get(0).getStreamAttributeList();
                        for (StreamAttribute attribute : streamAttributeList) {
                            if (attribute.getName().equals(variable.getAttributeName())) {
                                averageFunction.setType(attribute.getType());
                            }
                        }
                        windowFunction.addAverageFunction(averageFunction);
                        break;
                    }
                    case "sum": {
                        SumFunction sumFunction = new SumFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        sumFunction.setFunctionName(functionName + variable.getAttributeName());
                        sumFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

                        List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();
                        List<StreamAttribute> streamAttributeList = inputStreamEventList.get(0).getStreamAttributeList();
                        for (StreamAttribute attribute : streamAttributeList) {
                            if (attribute.getName().equals(variable.getAttributeName())) {
                                sumFunction.setType(attribute.getType());
                            }
                        }

                        windowFunction.addSumFunction(sumFunction);
                        break;
                    }
                    case "max": {
                        MaxFunction maxFunction = new MaxFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        maxFunction.setFunctionName(functionName + variable.getAttributeName());
                        maxFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

                        List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();
                        List<StreamAttribute> streamAttributeList = inputStreamEventList.get(0).getStreamAttributeList();

                        for (StreamAttribute attribute : streamAttributeList) {
                            if (attribute.getName().equals(variable.getAttributeName())) {
                                maxFunction.setType(attribute.getType());
                            }
                        }
                        windowFunction.addMaxFunction(maxFunction);
                        break;
                    }
                    case "min": {
                        MinFunction minFunction = new MinFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        minFunction.setFunctionName(functionName + variable.getAttributeName());
                        minFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

                        List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();
                        List<StreamAttribute> streamAttributeList = inputStreamEventList.get(0).getStreamAttributeList();
                        for (StreamAttribute attribute : streamAttributeList) {
                            if (attribute.getName().equals(variable.getAttributeName())) {
                                minFunction.setType(attribute.getType());
                            }
                        }

                        windowFunction.addMinFunction(minFunction);
                        break;
                    }
                    case "count": {
                        CountFunction countFunction = new CountFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        countFunction.setFunctionName(functionName + variable.getAttributeName());
                        countFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

                        List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();
                        List<StreamAttribute> streamAttributeList = inputStreamEventList.get(0).getStreamAttributeList();
                        for (StreamAttribute attribute : streamAttributeList) {
                            if (attribute.getName().equals(variable.getAttributeName())) {
                                countFunction.setType(attribute.getType());
                            }
                        }
                        windowFunction.addCountFunction(countFunction);
                        break;
                    }
                }
                windowFunctionList.add(windowFunction);
                solidityContract.setWindowFunctionList(windowFunctionList);

                Expression[] expressions = attributeFunction.getParameters();

                if (expressions[0] instanceof Variable) {
                    Variable variable = (Variable) expressions[0];

                    streamAttribute.setName(variable.getAttributeName());
                    streamAttribute.setRename(outputAttribute.getRename());
                    // System.out.println(variable);
                    List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();

                    List<StreamAttribute> streamAttributeList = inputStreamEventList.get(0).getStreamAttributeList();
                    for (StreamAttribute attribute : streamAttributeList) {
                        //System.out.println();
                        if (attribute.getName().equals(streamAttribute.getName())) {
                            streamAttribute.setType(attribute.getType());
                        }
                    }
                    moderatedOutputAttributes.add(streamAttribute);
                }

            } else if (expression instanceof Variable) {
                Variable variable = (Variable) expression;
                moderatedOutputAttributes.add(processVariable(variable, outputAttribute));
                solidityContract.addSequenceOutPuts(processSequenceVariable(variable));
            } else if (expression instanceof Subtract) {
                Subtract subtract = (Subtract) expression;
                Expression leftValue = subtract.getLeftValue();
                Expression rightValue = subtract.getRightValue();

                String subtractLeftExpression = "";
                if (leftValue instanceof Variable) {
                    Variable variable = (Variable) leftValue;
                    moderatedOutputAttributes.add(processVariable(variable, outputAttribute));
                    subtractLeftExpression = processSequenceVariable(variable);
                }
                String subtractRightExpression = "";
                if (rightValue instanceof Variable) {
                    Variable variable = (Variable) rightValue;
                    subtractRightExpression = processSequenceVariable(variable);

                }
                solidityContract.addSequenceOutPuts(outputAttribute.getRename() + ":" + "(" + subtractLeftExpression + " - " + subtractRightExpression + ")");
            } else if (expression instanceof Add) {
                Add add = (Add) expression;
                Expression leftValue = add.getLeftValue();
                Expression rightValue = add.getRightValue();

                String subtractLeftExpression = "";
                if (leftValue instanceof Variable) {
                    Variable variable = (Variable) leftValue;
                    moderatedOutputAttributes.add(processVariable(variable, outputAttribute));

                    subtractLeftExpression = processSequenceVariable(variable);
                }
                String subtractRightExpression = "";
                if (rightValue instanceof Variable) {
                    Variable variable = (Variable) rightValue;
                    subtractRightExpression = processSequenceVariable(variable);
                }
                solidityContract.addSequenceOutPuts(outputAttribute.getRename() + ":" + "(" + subtractLeftExpression + " + " + subtractRightExpression + ")");
            }else if (expression instanceof Multiply) {
                Multiply multiply = (Multiply) expression;
                Expression leftValue = multiply.getLeftValue();
                Expression rightValue = multiply.getRightValue();

                String subtractLeftExpression = "";
                if (leftValue instanceof Variable) {
                    Variable variable = (Variable) leftValue;
                    moderatedOutputAttributes.add(processVariable(variable, outputAttribute));
                    subtractLeftExpression = processSequenceVariable(variable);
                }
                String subtractRightExpression = "";
                if (rightValue instanceof Variable) {
                    Variable variable = (Variable) rightValue;
                    subtractRightExpression = processSequenceVariable(variable);
                }
                solidityContract.addSequenceOutPuts(outputAttribute.getRename() + ":" + "(" + subtractLeftExpression + " * " + subtractRightExpression + ")");
            }else if (expression instanceof Divide) {
                Divide divide = (Divide) expression;
                Expression leftValue = divide.getLeftValue();
                Expression rightValue = divide.getRightValue();

                String subtractLeftExpression = "";
                if (leftValue instanceof Variable) {
                    Variable variable = (Variable) leftValue;
                    moderatedOutputAttributes.add(processVariable(variable, outputAttribute));
                    subtractLeftExpression = processSequenceVariable(variable);
                }
                String subtractRightExpression = "";
                if (rightValue instanceof Variable) {
                    Variable variable = (Variable) rightValue;
                    subtractRightExpression = processSequenceVariable(variable);
                }
                solidityContract.addSequenceOutPuts(outputAttribute.getRename() + ":" + "(" + subtractLeftExpression + " / " + subtractRightExpression + ")");
            }else if (expression instanceof Mod) {
                Mod mod = (Mod) expression;
                Expression leftValue = mod.getLeftValue();
                Expression rightValue = mod.getRightValue();

                String subtractLeftExpression = "";
                if (leftValue instanceof Variable) {
                    Variable variable = (Variable) leftValue;
                    moderatedOutputAttributes.add(processVariable(variable, outputAttribute));
                    subtractLeftExpression = processSequenceVariable(variable);
                }
                String subtractRightExpression = "";
                if (rightValue instanceof Variable) {
                    Variable variable = (Variable) rightValue;
                    subtractRightExpression = processSequenceVariable(variable);
                }
                solidityContract.addSequenceOutPuts(outputAttribute.getRename() + ":" + "(" + subtractLeftExpression + " % " + subtractRightExpression + ")");
            }
        }

        moderatedOutputAttributes.get(moderatedOutputAttributes.size() - 1).setNotLastItem(false);
        this.solidityContract.setStreamOutputAttributeList(moderatedOutputAttributes);
    }


    public String processSequenceVariable(Variable variable) {
        String output = "";
        String streamId = variable.getStreamId();
        String position ="";

        if (streamId != null) {
            List<InitialInputStream> initialInputStreams = solidityContract.getInputStreamNames();
            for (InitialInputStream initialInputStream : initialInputStreams) {
                if (initialInputStream.getReferenceId() != null) {
                    if (initialInputStream.getReferenceId().equals(streamId)) {

                        if (initialInputStream.isInitial()) {
                            if(variable.getStreamIndex()!=null) {
                                if (variable.getStreamIndex() <= -2) {
                                    position = "[initial" + initialInputStream.getName() + "Event.length-" + (variable.getStreamIndex() + 1) + "]";
                                } else if (variable.getStreamIndex() >= 0) {
                                    position = "[" + variable.getStreamIndex() + "]";
                                }
                            }
                            output = "initial" + initialInputStream.getName() + "Event"+position+"." + variable.getAttributeName();
                        } else {
                            if(variable.getStreamIndex()!=null) {
                                if (variable.getStreamIndex() <= -2) {
                                    position = "[incoming" + initialInputStream.getName() + "Event.length-" + (-1)*(variable.getStreamIndex() + 1) + "]";
                                } else if (variable.getStreamIndex() >= 0) {
                                    position = "[" + variable.getStreamIndex() + "]";
                                }
                            }
                            output = "incoming" + initialInputStream.getName() + "Event"+position+"." + variable.getAttributeName();
                        }
                    }
                }
            }
        }
        return output;
    }

    public StreamOutputAttribute processVariable(Variable variable, OutputAttribute outputAttribute) {
        String streamId = variable.getStreamId();

        StreamOutputAttribute streamOutputAttribute = new StreamOutputAttribute();

        streamOutputAttribute.setName(variable.getAttributeName());
        streamOutputAttribute.setRename(outputAttribute.getRename());

        List<InputStreamEvent> inputStreamEventList = solidityContract.getInputStreamEventList();
        for (InputStreamEvent inputStreamEvent : inputStreamEventList) {

            List<String> referenceIds = inputStreamEvent.getReferenceIds();
            if (referenceIds.contains(streamId)) {
                for (StreamAttribute attribute : inputStreamEvent.getStreamAttributeList()) {
                    if (attribute.getName().equals(streamOutputAttribute.getName())) {
                        streamOutputAttribute.setType(attribute.getType());
                    }
                }
            } else {
                for (StreamAttribute attribute : inputStreamEvent.getStreamAttributeList()) {
                    if (attribute.getName().equals(streamOutputAttribute.getName())) {
                        streamOutputAttribute.setType(attribute.getType());
                    }
                }
            }
        }
        return streamOutputAttribute;
    }

    public String getAttributeType(Attribute.Type type) {
        if (type == Attribute.Type.INT) {
            return "uint8";
        } else if (type == Attribute.Type.INT8) {
            return "uint8";
        } else if (type == Attribute.Type.INT16) {
            return "uint16";
        } else if (type == Attribute.Type.INT32) {
            return "uint32";
        } else if (type == Attribute.Type.INT64) {
            return "uint64";
        } else if (type == Attribute.Type.INT128) {
            return "uint128";
        } else if (type == Attribute.Type.INT256) {
            return "uint256";
        } else if (type == Attribute.Type.LONG) {
            return "uint256";
        } else if (type == Attribute.Type.DOUBLE) {
            return "ufixed";
        } else if (type == Attribute.Type.STRING) {
            return "string";
        } else if (type == Attribute.Type.BOOL) {
            return "bool";
        } else {
            return "";
        }
    }

    public void processFilter(Filter filter, String streamId) {
        Expression[] expressions = filter.getParameters();
        for (Expression expression : expressions) {
            FilterExpression filterExpression = new FilterExpression();
            String output = getFilterExpression(expression, "incoming" + streamId);
            filterExpression.setInputStreamName(streamId);
            filterExpression.setExpression(output);
            solidityContract.addFilterExpression(filterExpression);
        }
    }

    public String getFilterExpression(Expression expression, String streamId) {
        String event = streamId + "Event.";
        String filterExpression = "";
        if (expression instanceof And) {
            And andExpression = (And) expression;
            String leftExpression = getFilterExpression(andExpression.getLeftExpression(), streamId);
            String rightExpression = getFilterExpression(andExpression.getRightExpression(), streamId);

            return "(" + leftExpression + " && " + rightExpression + ")";
        } else if (expression instanceof Or) {
            Or orExpression = (Or) expression;
            String leftExpression = getFilterExpression(orExpression.getLeftExpression(), streamId);
            String rightExpression = getFilterExpression(orExpression.getRightExpression(), streamId);

            return "(" + leftExpression + " || " + rightExpression + ")";
        } else if (expression instanceof Compare) {
            Compare compareExpression = (Compare) expression;
            String leftExpression = getFilterExpression(compareExpression.getLeftExpression(), streamId);
            String rightExpression = getFilterExpression(compareExpression.getRightExpression(), streamId);
            String operatorString = getOperatorString(compareExpression.getOperator());
            return "(" + leftExpression + " " + operatorString + " " + rightExpression + ")";

        } else if (expression instanceof BoolConstant) {
            BoolConstant boolExpression = (BoolConstant) expression;
            return "" + boolExpression.getValue();

        } else if (expression instanceof DoubleConstant) {
            DoubleConstant doubleExpression = (DoubleConstant) expression;
            return "" + doubleExpression.getValue();

        } else if (expression instanceof FloatConstant) {
            FloatConstant constant = (FloatConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof IntConstant) {
            IntConstant constant = (IntConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof LongConstant) {
            LongConstant constant = (LongConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof StringConstant) {
            StringConstant constant = (StringConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof Variable) {
            Variable constant = (Variable) expression;
            return event + constant.getAttributeName();

        } else if (expression instanceof Add) {
            Add addExpression = (Add) expression;
            String leftExpression = getFilterExpression(addExpression.getLeftValue(), streamId);
            String rightExpression = getFilterExpression(addExpression.getRightValue(), streamId);
            return "(" + leftExpression + " + " + rightExpression + ")";
        } else if (expression instanceof Subtract) {
            Subtract subtract = (Subtract) expression;
            String leftExpression = getFilterExpression(subtract.getLeftValue(), streamId);
            String rightExpression = getFilterExpression(subtract.getRightValue(), streamId);
            return "(" + leftExpression + " - " + rightExpression + ")";
        } else if (expression instanceof Multiply) {
            Multiply multiply = (Multiply) expression;
            String leftExpression = getFilterExpression(multiply.getLeftValue(), streamId);
            String rightExpression = getFilterExpression(multiply.getRightValue(), streamId);
            return "(" + leftExpression + " * " + rightExpression + ")";
        } else if (expression instanceof Divide) {
            Divide divide = (Divide) expression;
            String leftExpression = getFilterExpression(divide.getLeftValue(), streamId);
            String rightExpression = getFilterExpression(divide.getRightValue(), streamId);
            return "(" + leftExpression + "/" + rightExpression + ")";
        } else if (expression instanceof Mod) {
            Mod mod = (Mod) expression;
            String leftExpression = getFilterExpression(mod.getLeftValue(), streamId);
            String rightExpression = getFilterExpression(mod.getRightValue(), streamId);
            return "(" + leftExpression + "%" + rightExpression + ")";
        }

        return filterExpression;
    }

    public String getOperatorString(Compare.Operator operator) {
        if (operator == Compare.Operator.EQUAL) {
            return "=";
        } else if (operator == Compare.Operator.GREATER_THAN) {
            return ">";
        } else if (operator == Compare.Operator.GREATER_THAN_EQUAL) {
            return ">=";
        } else if (operator == Compare.Operator.LESS_THAN) {
            return "<";
        } else if (operator == Compare.Operator.LESS_THAN_EQUAL) {
            return "<=";
        } else {
            return "";
        }
    }

    public void processWindow(Window window, String streamId) {
        Expression[] expressions = window.getParameters();
        List<WindowExpression> windowExpressionList = new ArrayList<>();
        for (Expression expression : expressions) {
            WindowExpression windowExpression = new WindowExpression();
            //windowExpression.setWindowName(expression.g);
            int windowSize = 0;
            if (expression instanceof IntConstant) {
                IntConstant intConstant = (IntConstant) expression;
                windowSize = intConstant.getValue();
                windowExpression.setLength(windowSize);
                windowExpression.setInputStreamName(streamId);
                windowExpressionList.add(windowExpression);
            }
        }
        solidityContract.setWindowExpressionList(windowExpressionList);
    }
}
