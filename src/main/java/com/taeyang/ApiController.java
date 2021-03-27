package com.taeyang;

import model.testModel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @RequestMapping(value = "api/test",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTestGet(final HttpServletRequest Request) throws IOException {
        System.out.println("get");
        System.out.println("getParameter : " + (String)Request.getParameter("name"));
        System.out.println("getReader : " + Request.getReader().toString());
        System.out.println("good1");
        return "{\"result\":\"get\"}";
    }

    @RequestMapping(value = "api/test",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTestPost(final HttpServletRequest Request ,@RequestBody testModel reqModel) throws IOException {

        System.out.println("Post");
        System.out.println("reqModel.getName() : " + reqModel.getName());
        System.out.println("getHeader : " + Request.getHeader("User-Agent"));
        System.out.println("good1");
        System.out.println("good1");
        return "{\"result\":\"post\"}";
    }

    @RequestMapping(value = "api/test2",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTestPost2(final HttpServletRequest Request ,@RequestBody HashMap body) throws IOException {
        List<HashMap<String,String>> result = new ArrayList<>();


        return "{\"result\":\"post\"}";
    }


}
