package com.apispringboot.ayko;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/test/test")
    static String test()
    {
        return "Test EDILDI";
    }
}
