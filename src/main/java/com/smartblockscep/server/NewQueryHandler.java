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
import com.smartblockscep.server.api.execution.query.input.handler.StreamHandler;
import com.smartblockscep.server.api.execution.query.input.handler.Window;
import com.smartblockscep.server.api.execution.query.input.stream.SingleInputStream;
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

    public String compute(SiddhiApp siddhiApp) {
        setStreamDefinition(siddhiApp);
        setExpression(siddhiApp);

        setOutputStream(siddhiApp);

        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache m = mf.compile("WindowContract.mustache");

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
        System.out.println(text);
        List<ExecutionElement> executionElements = siddhiApp.getExecutionElementList();

        for (ExecutionElement executionElement : executionElements) {
            if (executionElement instanceof Query) {

                Query query = (Query) executionElement;

                SingleInputStream singleInputStream = (SingleInputStream) query.getInputStream();
                OutputStream outputStream = query.getOutputStream();
                smartContract.setInputStreamName(singleInputStream.getStreamId());
                smartContract.setOutputStreamName(outputStream.getId());

                List<StreamHandler> streamHandlerList = singleInputStream.getStreamHandlers();

                for (StreamHandler streamHandler : streamHandlerList) {
                    if (streamHandler instanceof Filter) {
                        System.out.println("Filter");
                        setFilter((Filter) streamHandler);

                    } else if (streamHandler instanceof Window) {
                        System.out.println("Window");
                        setWindow((Window) streamHandler);
                    }
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
        int expression = 0;
        expression = getWindowExpression(window.getParameters()[0]);
        smartContract.setWindowLength(expression);
    }

    public void setOutputStream(SiddhiApp siddhiApp) {

        List<ExecutionElement> executionElements = siddhiApp.getExecutionElementList();
        List<StreamOutputAttribute> moderatedOutputAttributes = new ArrayList<>();

        for (ExecutionElement executionElement : executionElements) {

            if (executionElement instanceof Query) {
                Query query = (Query) executionElement;

                Selector selector = query.getSelector();

                List<OutputAttribute> selectionList = selector.getSelectionList();
                List<Variable> groupByList = selector.getGroupByList();
                Expression havingExpression = selector.getHavingExpression();
                Constant limit = selector.getLimit();
                Constant offset = selector.getOffset();
                List<OrderByAttribute> orderByAttributeList = selector.getOrderByList();

                for (OutputAttribute outputAttribute : selectionList) {
                    Expression outputAttributeExpression = outputAttribute.getExpression();

                    if (outputAttributeExpression instanceof AttributeFunction) {
                        AttributeFunction attributeFunction = (AttributeFunction) outputAttribute.getExpression();
                        String functionName = attributeFunction.getName();
                        //System.out.println(functionName);
                        Expression[] expressions = attributeFunction.getParameters();
                        for (Expression expression : expressions)
                            if (expression instanceof Variable) {
                                Variable variable = (Variable) expression;
                                System.out.println(variable.getAttributeName());
                            }

                    } else if (outputAttributeExpression instanceof Variable) {
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

                    this.smartContract.setOutAttributes(moderatedOutputAttributes);
                }

                for (Variable variable : groupByList) {
                    System.out.println(variable.getAttributeName());
                }

//                Process having
                System.out.println(havingExpression);
                if(havingExpression instanceof Compare){
                    Compare compare = (Compare) havingExpression;
                    Expression rightExpression = compare.getRightExpression();
                    Expression leftExpression = compare.getLeftExpression();
                    Compare.Operator operator = compare.getOperator();
                    System.out.println("rightExpression "+rightExpression);
                    System.out.println("leftExpression "+leftExpression);
                    
                }else if(havingExpression instanceof And){
                    And and = (And) havingExpression;
                    Expression leftExpression = and.getLeftExpression();
                    Expression rightExpression = and.getRightExpression();

                }

                if(limit != null){
                   IntConstant intConstant = (IntConstant) limit;
                    System.out.println(intConstant.getValue());
                }

                if(offset != null){
                    IntConstant intConstant = (IntConstant) offset;
                    System.out.println(intConstant.getValue());
                }


            }

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
            return "uint";
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
