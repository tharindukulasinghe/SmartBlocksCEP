package com.smartblockscep.server;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.smartblockscep.server.api.SiddhiApp;
import com.smartblockscep.server.api.definition.Attribute;
import com.smartblockscep.server.api.definition.StreamDefinition;
import com.smartblockscep.server.api.execution.ExecutionElement;
import com.smartblockscep.server.api.execution.query.Query;
import com.smartblockscep.server.api.execution.query.input.handler.Filter;
import com.smartblockscep.server.api.execution.query.input.handler.Window;
import com.smartblockscep.server.api.execution.query.input.stream.SingleInputStream;
import com.smartblockscep.server.api.execution.query.output.stream.OutputStream;
import com.smartblockscep.server.api.execution.query.selection.OutputAttribute;
import com.smartblockscep.server.api.expression.AttributeFunction;
import com.smartblockscep.server.api.expression.Expression;
import com.smartblockscep.server.api.expression.Variable;
import com.smartblockscep.server.api.expression.condition.And;
import com.smartblockscep.server.api.expression.condition.Compare;
import com.smartblockscep.server.api.expression.condition.Or;
import com.smartblockscep.server.api.expression.constant.*;
import com.smartblockscep.server.AverageFunction;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NewQueryHandler {
    SmartContract smartContract = new SmartContract();

    boolean isfilter = false;
    WindowType windowType;

    public static SiddhiApp parseMe(String query) {

        CharStream input = CharStreams.fromString(query);
        SiddhiQLLexer lexer = new SiddhiQLLexer(input);
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SiddhiQLParser parser = new SiddhiQLParser(tokens);
        parser.removeErrorListeners();

        ParseTree tree = parser.parse();

        SiddhiQLVisitor eval = new BaseVisitorImpl();
        return (SiddhiApp) eval.visit(tree);
    }

    public String computeWindow(SiddhiApp siddhiApp) {
        setStreamDefinition(siddhiApp);
        setExpression(siddhiApp);

        setOutputStream(siddhiApp);

        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache m;
        if (this.isfilter) {
            m = mf.compile("SmartContract.mustache");
        } else {
            if(windowType == WindowType.lengthBatch){
                m = mf.compile("WindowContract.mustache");
            }
            else {
                m = mf.compile("WindowContract.mustache");
            }
            m = mf.compile("SlidingWindowContract.mustache");
        }


        String output = "";

        try {
            StringWriter writer = new StringWriter();
            m.execute(writer, smartContract).flush();
            output = writer.toString();
        } catch (Exception e) {

        }
        return output;
    }

    public void setExpression(SiddhiApp siddhiApp) {
        String text = siddhiApp.toString();
        //System.out.println(text);
        List<ExecutionElement> executionElements = siddhiApp.getExecutionElementList();
        String expression = "";
        if (executionElements.get(0) instanceof Query) {
            Query query = (Query) executionElements.get(0);
            SingleInputStream singleInputStream = (SingleInputStream) query.getInputStream();
            OutputStream outputStream = query.getOutputStream();
            smartContract.setInputStreamName(singleInputStream.getStreamId());
            smartContract.setOutputStreamName(outputStream.getId());

            if (singleInputStream.getStreamHandlers().size() != 0) {
                System.out.println(singleInputStream.getStreamHandlers().get(0));
                if (singleInputStream.getStreamHandlers().get(0) instanceof Filter) {
                    System.out.println("Filter");
                    this.isfilter = true;
                    setFilter((Filter) singleInputStream.getStreamHandlers().get(0));

                } else if (singleInputStream.getStreamHandlers().get(0) instanceof Window) {
                    System.out.println("Window");
                    setWindow((Window) singleInputStream.getStreamHandlers().get(0));
                } else {
                    System.out.println("Filter");
                    this.isfilter = true;
                    setFilter((Filter) singleInputStream.getStreamHandlers().get(0));
                }
            }

        }
    }

    public void setFilter(Filter filter) {
        String expression = "";
        this.smartContract.setHasFilter(true);
        this.smartContract.setHasNoFilter(false);
        expression = getFilterExpression(filter.getParameters()[0]);
        this.smartContract.setExpression(expression);
    }

    public void setWindow(Window window) {
        smartContract.setHasNoFilter(true);

        System.out.println(window.getName());
        if(window.getName().equals("lengthBatch")){
            windowType = WindowType.lengthBatch;
        }
        else if(window.getName().equals("length")) {
            windowType = WindowType.length;
        }
        int expression = 0;
        expression = getWindowExpression(window.getParameters()[0]);
        smartContract.setWindowLength(expression);
    }

    public void setOutputStream(SiddhiApp siddhiApp) {

        List<ExecutionElement> executionElements = siddhiApp.getExecutionElementList();
        List<StreamOutputAttribute> moderatedOutputAttributes = new ArrayList<>();
        List<OutputAttribute> outputAttributes = new ArrayList<>();

        if (executionElements.get(0) instanceof Query) {
            Query query = (Query) executionElements.get(0);
            outputAttributes = query.getSelector().getSelectionList();

        }

        if (outputAttributes.size() != 0) {
            System.out.println(outputAttributes.size());
            for (OutputAttribute outputAttribute : outputAttributes) {
                System.out.println(outputAttribute.getExpression());

                if (outputAttribute.getExpression() instanceof AttributeFunction) {
                    StreamOutputAttribute streamAttribute = new StreamOutputAttribute();
                    AttributeFunction attributeFunction = (AttributeFunction) outputAttribute.getExpression();
                    String functionName = attributeFunction.getName();

                    if (functionName.equals("avg")) {
                        smartContract.setAverageFunction(true);
                        AverageFunction averageFunction = new AverageFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        averageFunction.setFunctionName(functionName + variable.getAttributeName());
                        averageFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                averageFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addAverageFunction(averageFunction);
                    } else if (functionName.equals("sum")) {
                        SumFunction sumFunction = new SumFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        sumFunction.setFunctionName(functionName + variable.getAttributeName());
                        sumFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                sumFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addSumFunction(sumFunction);
                    } else if (functionName.equals("max")) {
                        MaxFunction maxFunction = new MaxFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        maxFunction.setFunctionName(functionName + variable.getAttributeName());
                        maxFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                maxFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addMaxFunction(maxFunction);
                    } else if (functionName.equals("min")) {
                        MinFunction minFunction = new MinFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        minFunction.setFunctionName(functionName + variable.getAttributeName());
                        minFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                minFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addMinFunction(minFunction);
                    } else if (functionName.equals("count")) {
                        CountFunction countFunction = new CountFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        countFunction.setFunctionName(functionName + variable.getAttributeName());
                        countFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                countFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addCountFunction(countFunction);
                    } else if (functionName.equals("maxForever")) {
                        MaxForeverFunction maxForeverFunction = new MaxForeverFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        maxForeverFunction.setFunctionName(functionName + variable.getAttributeName());
                        maxForeverFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                maxForeverFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addMaxForeverFunction(maxForeverFunction);
                    } else if (functionName.equals("minForever")) {
                        MinForeverFunction minForeverFunction = new MinForeverFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        minForeverFunction.setFunctionName(functionName + variable.getAttributeName());
                        minForeverFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
                                minForeverFunction.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }

                        smartContract.addMinForeverFunction(minForeverFunction);
                    }

                    System.out.println(functionName);
                    Expression[] expressions = attributeFunction.getParameters();
                    if (expressions[0] instanceof Variable) {
                        Variable variable = (Variable) expressions[0];

                        streamAttribute.setName(variable.getAttributeName());
                        streamAttribute.setRename(outputAttribute.getRename());

                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                            if (smartContract.getAttributes().get(i).getName().equals(streamAttribute.getName())) {
                                streamAttribute.setType(smartContract.getAttributes().get(i).getType());
                            }
                        }
                        moderatedOutputAttributes.add(streamAttribute);
                    }

                } else if (outputAttribute.getExpression() instanceof Variable) {
                    Variable variable = (Variable) outputAttribute.getExpression();

                    StreamOutputAttribute streamAttribute = new StreamOutputAttribute();

                    streamAttribute.setName(variable.getAttributeName());
                    streamAttribute.setRename(outputAttribute.getRename());
                    for (int i = 0; i < smartContract.getAttributes().size(); i++) {
                        if (smartContract.getAttributes().get(i).getName().equals(streamAttribute.getName())) {
                            streamAttribute.setType(smartContract.getAttributes().get(i).getType());
                        }
                    }

                    moderatedOutputAttributes.add(streamAttribute);
                }


            }

            moderatedOutputAttributes.get(moderatedOutputAttributes.size() - 1).setNotLastItem(false);
            this.smartContract.setOutAttributes(moderatedOutputAttributes);
        }

    }

    public void setStreamDefinition(SiddhiApp siddhiApp) {

        Map<String, StreamDefinition> streamDefinitionMap = siddhiApp.getStreamDefinitionMap();

        StreamDefinition streamDefinition = streamDefinitionMap.get(streamDefinitionMap.keySet().toArray()[0]);

        Iterator<Attribute> attributeIterator = streamDefinition.getAttributeList().iterator();

        List<StreamAttribute> moderatedInputAttributes = new ArrayList<>();

        while (attributeIterator.hasNext()) {
            Attribute attribute = attributeIterator.next();

            StreamAttribute streamAttribute = new StreamAttribute();
            streamAttribute.setName(attribute.getName());
            streamAttribute.setType(getAttributeType(attribute.getType()));
            moderatedInputAttributes.add(streamAttribute);
        }

        smartContract.setAttributes(moderatedInputAttributes);
    }

    public int getWindowExpression(Expression expression) {
        int windowSize = 0;
        if (expression instanceof IntConstant) {
            IntConstant intConstant = (IntConstant) expression;
            windowSize = intConstant.getValue();
        }
        return windowSize;
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

    public String getFilterExpression(Expression expression) {

        String event = "incoming" + smartContract.getInputStreamName() + "Event.";

        String filterExpression = "";

        if (expression instanceof And) {
            And andExpression = (And) expression;
            String leftExpression = getFilterExpression(andExpression.getLeftExpression());
            String rightExpression = getFilterExpression(andExpression.getRightExpression());

            return "(" + leftExpression + " && " + rightExpression + ")";
        } else if (expression instanceof Or) {
            Or orExpression = (Or) expression;
            String leftExpression = getFilterExpression(orExpression.getLeftExpression());
            String rightExpression = getFilterExpression(orExpression.getRightExpression());

            return "(" + leftExpression + " || " + rightExpression + ")";
        } else if (expression instanceof Compare) {
            Compare compareExpression = (Compare) expression;
            String leftExpression = getFilterExpression(compareExpression.getLeftExpression());
            String rightExpression = getFilterExpression(compareExpression.getRightExpression());
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

        } else if (expression instanceof TimeConstant) {
            TimeConstant constant = (TimeConstant) expression;
            return "" + constant.getValue();

        } else if (expression instanceof Variable) {
            Variable constant = (Variable) expression;
            return event + constant.getAttributeName();

        }

        return filterExpression;
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
}
