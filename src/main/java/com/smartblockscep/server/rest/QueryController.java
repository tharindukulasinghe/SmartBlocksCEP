package com.smartblockscep.server.rest;

import com.smartblockscep.server.BaseQuery;
import com.smartblockscep.server.NewQueryHandler;
import com.smartblockscep.server.QueryHandler;
import com.smartblockscep.server.Response;
import com.smartblockscep.server.api.SiddhiApp;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QueryController {

    @CrossOrigin
    @PostMapping("/query")
    public Response requestQuery(@RequestBody BaseQuery query) {

        NewQueryHandler queryHandler = new NewQueryHandler();

        SiddhiApp siddhiApp = NewQueryHandler.parseMe(query.getQuery());


        String out = queryHandler.computeWindow(siddhiApp);

        return new Response(false, out);
    }

}
