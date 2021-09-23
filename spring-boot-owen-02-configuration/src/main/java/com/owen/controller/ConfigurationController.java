package com.owen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigurationController {

    @RequestMapping("/configuration")
    @ResponseBody
    public String configuration(){
        return "hello configuration";
    }
}
