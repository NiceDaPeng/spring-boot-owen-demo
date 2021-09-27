package com.owen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

//视图层使用的注解 使用@Controller
//如果是返回的json数据，可以使用RestController
@Controller
public class FTLController {


    @RequestMapping("/ftl")
    public String index(Model model){

        model.addAttribute("nnn",new Date().toString());
        return "index";
    }



}
