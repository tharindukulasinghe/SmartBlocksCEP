package com.smartblockscep.server.rest;

import com.smartblockscep.server.BaseQuery;
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

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/query")
    public Response requestQuery(@RequestBody BaseQuery query) {

        QueryHandler queryHandler = new QueryHandler();

        SiddhiApp siddhiApp = queryHandler.parse(query.getQuery());

        String data = queryHandler.compute(siddhiApp);

        Response response = new Response(false, data);

        return response;
    }

}
