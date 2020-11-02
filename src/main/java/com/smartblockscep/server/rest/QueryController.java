package com.smartblockscep.server.rest;

import com.smartblockscep.server.BaseQuery;
import com.smartblockscep.server.NewQueryHandler;
import com.smartblockscep.server.api.SiddhiApp;
import com.smartblockscep.server.test.CodeGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QueryController {

    @CrossOrigin
    @PostMapping("/query")
    public String requestQuery(@RequestBody BaseQuery query) {
        CodeGenerator codeGenerator = new CodeGenerator();

        SiddhiApp siddhiApp = NewQueryHandler.parseMe(query.getQuery());


        String out = codeGenerator.processOutput(siddhiApp);
        //return new Response(false, out);
        return out;
    }

}
