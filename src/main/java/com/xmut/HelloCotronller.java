package com.xmut;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotronller {

    @RequestMapping("/first")
    public String sayHello(){
        return "hello";
    }
    @RequestMapping("/second")
    public String saygood(){
        return "good";
    }
    @RequestMapping("/third")
    public String saythanks(){
        return "thanks";
    }
    @RequestMapping("/hotfixthird")
    public String hotfixsaythanks(){
        return "thanks";
    }

    @RequestMapping("/mastertest")
    public String mastertest(){
        return "mastertest";
    }
}
