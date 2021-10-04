package com.owen.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @RequestMapping("/inter")
    public String inter(){

        System.out.println("控制层执行了");
        return "hello servlet";
    }
}
