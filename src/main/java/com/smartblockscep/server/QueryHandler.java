package com.smartblockscep.server;

import com.smartblockscep.server.api.SiddhiApp;
import com.smartblockscep.server.api.execution.ExecutionElement;
import com.smartblockscep.server.api.execution.query.Query;
import com.smartblockscep.server.api.execution.query.input.stream.SingleInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.smartblockscep.server.SiddhiQLLexer;
import com.smartblockscep.server.SiddhiQLParser;

import java.util.List;

public class QueryHandler {

    public static SiddhiApp parse(String siddhiApp) {
        CharStream input = CharStreams.fromString(siddhiApp);
        SiddhiQLLexer lexer = new SiddhiQLLexer(input);
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SiddhiQLParser parser = new SiddhiQLParser(tokens);
        //            parser.setErrorHandler(new BailErrorStrategy());
        parser.removeErrorListeners();
        ParseTree tree = parser.parse();

        SiddhiQLVisitor eval = new BaseVisitorImpl();
        return (SiddhiApp) eval.visit(tree);
    }

    public static void compute(SiddhiApp siddhiApp) {

        List<ExecutionElement> executionElements = siddhiApp.getExecutionElementList();

        if(executionElements.get(0) instanceof Query){
            Query query = (Query) executionElements.get(0);

            SingleInputStream singleInputStream = (SingleInputStream) query.getInputStream();

            System.out.println(singleInputStream.getStreamHandlers().get(0).getParameters());
        }

    }


}
