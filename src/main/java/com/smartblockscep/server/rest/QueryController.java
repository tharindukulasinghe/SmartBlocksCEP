package com.smartblockscep.server.rest;

import com.smartblockscep.server.BaseQuery;
import com.smartblockscep.server.NewQueryHandler;
import com.smartblockscep.server.QueryHandler;
import com.smartblockscep.server.api.SiddhiApp;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QueryController {

    @PostMapping("/query")
    public String requestQuery(@RequestBody BaseQuery query) {

//        QueryHandler queryHandler = new QueryHandler();
//
//        SiddhiApp siddhiApp = queryHandler.parse(query.getQuery());
//
//        String out = queryHandler.compute(siddhiApp);
        NewQueryHandler queryHandler = new NewQueryHandler();

        SiddhiApp siddhiApp = queryHandler.parseMe(query.getQuery());
        String out = queryHandler.computeWindow(siddhiApp);

        return out;
    }

}
