package com.xmut;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotronller {

    @RequestMapping
    public String sayHello(){
        return "hello";
    }

}
