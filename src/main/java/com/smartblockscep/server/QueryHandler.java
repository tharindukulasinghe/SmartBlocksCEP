package com.smartblockscep.server;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.smartblockscep.server.api.SiddhiApp;
import com.smartblockscep.server.api.definition.Attribute;
import com.smartblockscep.server.api.definition.StreamDefinition;
import com.smartblockscep.server.api.execution.ExecutionElement;
import com.smartblockscep.server.api.execution.query.Query;
import com.smartblockscep.server.api.execution.query.input.stream.SingleInputStream;
import com.smartblockscep.server.api.execution.query.output.stream.InsertIntoStream;
import com.smartblockscep.server.api.execution.query.selection.OutputAttribute;
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

public class QueryHandler {

    public static SiddhiApp parse(String siddhiApp) {
        CharStream input = CharStreams.fromString(siddhiApp);
        SiddhiQLLexer lexer = new SiddhiQLLexer(input);
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SiddhiQLParser parser = new SiddhiQLParser(tokens);

        parser.removeErrorListeners();
        ParseTree tree = parser.parse();

        SiddhiQLVisitor eval = new BaseVisitorImpl();
        return (SiddhiApp) eval.visit(tree);
    }

    public static String compute(SiddhiApp siddhiApp) {

        List<ExecutionElement> executionElements = siddhiApp.getExecutionElementList();

        Map<String, StreamDefinition> streamMap = siddhiApp.getStreamDefinitionMap();

        System.out.println(streamMap.get(streamMap.keySet().toArray()[0]));

        StreamDefinition streamDefinition = streamMap.get(streamMap.keySet().toArray()[0]);

        String result = "";

        InsertIntoStream insertIntoStream;

        List<StreamOutputAttribute> moderatedOutputAttributes = new ArrayList<>();
        List<OutputAttribute> outputAttributes = new ArrayList<>();

        if (executionElements.get(0) instanceof Query) {
            Query query = (Query) executionElements.get(0);

            SingleInputStream singleInputStream = (SingleInputStream) query.getInputStream();
            insertIntoStream = (InsertIntoStream) query.getOutputStream();

            outputAttributes = query.getSelector().getSelectionList();
            System.out.println(outputAttributes.get(0).toString());

            result = getFilterExpression(singleInputStream.getStreamHandlers().get(0).getParameters()[0]);
        }

        Iterator<OutputAttribute> outAttributeIterator = outputAttributes.iterator();

        while (outAttributeIterator.hasNext()) {
            OutputAttribute attribute = outAttributeIterator.next();
            Variable variable = (Variable) attribute.getExpression();

            StreamOutputAttribute streamAttribute = new StreamOutputAttribute();

            streamAttribute.setName(variable.getAttributeName());
            streamAttribute.setRename(attribute.getRename());
            moderatedOutputAttributes.add(streamAttribute);
        }


        Iterator<Attribute> attributeIterator = streamDefinition.getAttributeList().iterator();

        List<StreamAttribute> moderatedInputAttributes = new ArrayList<>();

        while (attributeIterator.hasNext()) {
            Attribute attribute = attributeIterator.next();

            StreamAttribute streamAttribute = new StreamAttribute();
            streamAttribute.setName(attribute.getName());
            streamAttribute.setType(getAttributeType(attribute.getType()));
            moderatedInputAttributes.add(streamAttribute);
        }

        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache m = mf.compile("SmartContract.mustache");

        String output = "";

        try {
            SmartContract todo = new SmartContract();

            todo.setExpression(result);

            todo.setAttributes(moderatedInputAttributes);
            todo.setOutAttributes(moderatedOutputAttributes);
            StringWriter writer = new StringWriter();
            m.execute(writer, todo).flush();
            output = writer.toString();
            //System.out.println(output);
        } catch (Exception e) {

        }

        return output;

    }

    public static String getFilterExpression(Expression expression) {

        String event = "incomingEvent.";

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

    public static String getOperatorString(Compare.Operator operator) {
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

    public static String getAttributeType(Attribute.Type type) {
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
