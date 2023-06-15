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
    @RequestMapping("/hotfixtext")
    public String hotfixtext(){
        return "hotfixtext";
    }

    @RequestMapping("/pushssh")
    public String pushssh(){
        return "pushssh";
    }

     @RequestMapping("/pullssh")
    public String pullssh(){
        return "pullssh";
    }

    public String updategithub(){
        return "github上更新了，码云上通过点击项目名字旁边的更新按钮进行同步更新";
}
