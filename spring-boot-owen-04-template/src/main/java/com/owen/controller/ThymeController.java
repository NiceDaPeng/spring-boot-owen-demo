package com.owen.controller;

import com.owen.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String index(Model model){
        model.addAttribute("uname","Thymeleaf");
        model.addAttribute("upass","123");
        return "/thymeleaf/index";
    }

    @RequestMapping("/rest")
    public String rest(Model model){
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("令狐冲");
        restaurant.setChef("裘千仞");
        model.addAttribute("restaurant",restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}
