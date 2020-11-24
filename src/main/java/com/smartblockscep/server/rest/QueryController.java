package com.smartblockscep.server.rest;

import com.smartblockscep.server.ActionResult;
import com.smartblockscep.server.BaseQuery;
import com.smartblockscep.server.NewQueryHandler;
import com.smartblockscep.server.Response;
import com.smartblockscep.server.api.SiddhiApp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QueryController {

    @CrossOrigin
    @PostMapping("/query")
    public String requestQuery(@RequestBody BaseQuery query) {

        NewQueryHandler queryHandler = new NewQueryHandler();

        SiddhiApp siddhiApp = NewQueryHandler.parseMe(query);

        String out = queryHandler.computeWindow(siddhiApp, query.getPrecision());

        //ActionResult result = new ActionResult(out);

        //return new Response(false, out);
        return out;
    }

}
