package com.owen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//做业务逻辑请求i分发，组装相应。
@RestController
public class HelloController {

    /**
     * 指定请求和方法之间的关系
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello owen";
    }
}
