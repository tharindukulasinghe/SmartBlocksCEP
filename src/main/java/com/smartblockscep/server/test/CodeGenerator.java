package com.smartblockscep.server.test;

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
import com.smartblockscep.server.api.expression.constant.Constant;
import com.smartblockscep.server.api.expression.constant.TimeConstant;
import com.smartblockscep.server.api.expression.math.Subtract;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CodeGenerator {
    SolidityContract solidityContract = new SolidityContract();

    public void processOutput(SiddhiApp siddhiApp) {
        System.out.println(siddhiApp);
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
                // processInputStream(inputStream);

                // handle selector
                Selector selector = query.getSelector();
                processSelector(selector);

                // handle output stream
                OutputStream outputStream = query.getOutputStream();
            }
        }
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
            //System.out.println(inputStream);
            SingleInputStream singleInputStream = (SingleInputStream) inputStream;
            // System.out.println(singleInputStream.getStreamId());
            // System.out.println(singleInputStream.getAllStreamIds());

            //smartContract.setInputStreamName(singleInputStream.getStreamId());

            List<StreamHandler> streamHandlerList = singleInputStream.getStreamHandlers();

            for (StreamHandler streamHandler : streamHandlerList) {
                if (streamHandler instanceof Filter) {
                    //setFilter((Filter) streamHandler);

                } else if (streamHandler instanceof Window) {
                    //setWindow((Window) streamHandler);
                }
            }

        } else if (inputStream instanceof StateInputStream) {

            StateInputStream stateInputStream = (StateInputStream) inputStream;
            StateInputStream.Type type = stateInputStream.getStateType();

            //smartContract.setInputStreamNames(stateInputStream.getUniqueStreamIds());

            if (type.equals(StateInputStream.Type.PATTERN)) {

                StateElement stateElement = stateInputStream.getStateElement();
                //System.out.println(stateInputStream);
                TimeConstant timeConstant = stateInputStream.getWithinTime();
                //System.out.println(timeConstant);

                if (stateElement instanceof NextStateElement) {
                    NextStateElement nextStateElement = (NextStateElement) stateElement;
                    // get state element
                    StateElement stateElement1 = nextStateElement.getStateElement();

                    //process state element
                    if (stateElement1 instanceof EveryStateElement) {
                        EveryStateElement everyStateElement = (EveryStateElement) stateElement1;

                        // handle state element
                        StateElement stateElement2 = everyStateElement.getStateElement();

                        if (stateElement2 instanceof StreamStateElement) {
                            StreamStateElement streamStateElement = (StreamStateElement) stateElement2;

                            // handle basic single input stream
                            BasicSingleInputStream basicSingleInputStream = streamStateElement.getBasicSingleInputStream();

//                                    System.out.println(basicSingleInputStream);
//                                    System.out.println("StreamId: " + basicSingleInputStream.getStreamId());
//                                    System.out.println("ReferenceId: " + basicSingleInputStream.getStreamReferenceId());

                            // handle stream handlers
                            List<StreamHandler> streamHandlerList = basicSingleInputStream.getStreamHandlers();
                            for (StreamHandler streamHandler : streamHandlerList) {
                                if (streamHandler instanceof Filter) {
                                    System.out.println(streamHandler);
                                    // todo implement filter method
                                    //setFilter((Filter) streamHandler);
                                }
                            }

                        }
                    }

                    //get next state element
                    StateElement stateElementNextStateElement = nextStateElement.getNextStateElement();

                    // process next state element
                    if (stateElementNextStateElement instanceof NextStateElement) {
                        NextStateElement nextStateElement1 = (NextStateElement) stateElementNextStateElement;

                        //get state element
                        StateElement stateElement2 = nextStateElement1.getStateElement();

                        //process state element
                        if (stateElement2 instanceof CountStateElement) {
                            System.out.println(stateElementNextStateElement);
                            CountStateElement countStateElement = (CountStateElement) stateElement2;
                        }

                        // get next state element
                        StateElement stateElement3 = nextStateElement1.getNextStateElement();

                        //process next state element
                        if (stateElement3 instanceof StreamStateElement) {
                            StreamStateElement streamStateElement = (StreamStateElement) stateElement3;
                            BasicSingleInputStream basicSingleInputStream = streamStateElement.getBasicSingleInputStream();

                            System.out.println(basicSingleInputStream);
                            System.out.println("StreamId: " + basicSingleInputStream.getStreamId());
                            System.out.println("ReferenceId: " + basicSingleInputStream.getStreamReferenceId());

                            List<StreamHandler> streamHandlerList = basicSingleInputStream.getStreamHandlers();
                            for (StreamHandler streamHandler : streamHandlerList) {
                                if (streamHandler instanceof Filter) {
                                    System.out.println(streamHandler);
                                    // todo implement filter method
                                    //setFilter((Filter) streamHandler);
                                }
                            }
                        }
                    }
                }

            } else if (type.equals(StateInputStream.Type.SEQUENCE)) {
                System.out.println(StateInputStream.Type.SEQUENCE);
            }
        }
    }

    private void processSelector(Selector selector) {
        // get selection list
        List<OutputAttribute> outputAttributeList = selector.getSelectionList();
        processOutputAttributeList(outputAttributeList);

        // get groupBy list
        List<Variable> variableList = selector.getGroupByList();

        // get having expression
        Expression expression = selector.getHavingExpression();

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

            // get rename
            String rename = outputAttribute.getRename();
            // todo process rename

            // get expression
            Expression expression = outputAttribute.getExpression();

            if (expression instanceof AttributeFunction) {

                StreamOutputAttribute streamAttribute = new StreamOutputAttribute();
                AttributeFunction attributeFunction = (AttributeFunction) expression;
                String functionName = attributeFunction.getName();

                switch (functionName) {
                    case "avg": {
                        //smartContract.setAverageFunction(true);
                        AverageFunction averageFunction = new AverageFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        averageFunction.setFunctionName(functionName + variable.getAttributeName());
                        averageFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
//                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
//                                averageFunction.setType(smartContract.getAttributes().get(i).getType());
//                            }
//                        }
//
//                        smartContract.addAverageFunction(averageFunction);
                        break;
                    }
                    case "sum": {
                        SumFunction sumFunction = new SumFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        sumFunction.setFunctionName(functionName + variable.getAttributeName());
                        sumFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());
//                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
//                                sumFunction.setType(smartContract.getAttributes().get(i).getType());
//                            }
//                        }
//
//                        smartContract.addSumFunction(sumFunction);
                        break;
                    }
                    case "max": {
                        MaxFunction maxFunction = new MaxFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        maxFunction.setFunctionName(functionName + variable.getAttributeName());
                        maxFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

//                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
//                                maxFunction.setType(smartContract.getAttributes().get(i).getType());
//                            }
//                        }
//
//                        smartContract.addMaxFunction(maxFunction);
                        break;
                    }
                    case "min": {
                        MinFunction minFunction = new MinFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        minFunction.setFunctionName(functionName + variable.getAttributeName());
                        minFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

//                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
//                                minFunction.setType(smartContract.getAttributes().get(i).getType());
//                            }
//                        }
//
//                        smartContract.addMinFunction(minFunction);
                        break;
                    }
                    case "count": {
                        CountFunction countFunction = new CountFunction();
                        Variable variable = (Variable) attributeFunction.getParameters()[0];
                        countFunction.setFunctionName(functionName + variable.getAttributeName());
                        countFunction.setMember(variable.getAttributeName());
                        streamAttribute.setFunction(functionName + variable.getAttributeName());

//                        for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                            if (smartContract.getAttributes().get(i).getName().equals(variable.getAttributeName())) {
//                                countFunction.setType(smartContract.getAttributes().get(i).getType());
//                            }
//                        }
//
//                        smartContract.addCountFunction(countFunction);
                        break;
                    }
                }

                Expression[] expressions = attributeFunction.getParameters();

                if (expressions[0] instanceof Variable) {
                    Variable variable = (Variable) expressions[0];

                    streamAttribute.setName(variable.getAttributeName());
                    streamAttribute.setRename(outputAttribute.getRename());

//                    for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                        if (smartContract.getAttributes().get(i).getName().equals(streamAttribute.getName())) {
//                            streamAttribute.setType(smartContract.getAttributes().get(i).getType());
//                        }
//                    }
                    moderatedOutputAttributes.add(streamAttribute);
                }

            } else if (expression instanceof Variable) {
                System.out.println(expression);
                Variable variable = (Variable) expression;

                StreamOutputAttribute streamAttribute = new StreamOutputAttribute();

                streamAttribute.setName(variable.getAttributeName());
                streamAttribute.setRename(outputAttribute.getRename());

//                for (int i = 0; i < smartContract.getAttributes().size(); i++) {
//                    if (smartContract.getAttributes().get(i).getName().equals(streamAttribute.getName())) {
//                        streamAttribute.setType(smartContract.getAttributes().get(i).getType());
//                    }
//                }
                moderatedOutputAttributes.add(streamAttribute);
            }
            else if (expression instanceof Subtract){
                Subtract subtract = (Subtract) expression;
                Expression leftValue = subtract.getLeftValue();
                Expression rightValue = subtract.getRightValue();

                System.out.println(rightValue);

                if(leftValue instanceof Variable){
                    Variable variable = (Variable) leftValue;
                }

                if(rightValue instanceof Variable){
                    Variable variable = (Variable) rightValue;
                }
            }
            System.out.println(expression.toString());
            System.out.println(expression.getClass());
        }


        moderatedOutputAttributes.get(moderatedOutputAttributes.size() - 1).setNotLastItem(false);
        //this.smartContract.setOutAttributes(moderatedOutputAttributes);
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
