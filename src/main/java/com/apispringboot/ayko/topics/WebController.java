package com.apispringboot.ayko.topics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String index()
    {
        return "uploadview.html";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexMain()
    {
        return "uploadview.html";
    }
}
