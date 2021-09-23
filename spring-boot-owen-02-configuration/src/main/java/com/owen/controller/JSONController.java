package com.owen.controller;

import com.owen.bean.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {

    @Value("${food.rice}")
    private String rice;

    @Value("${food.meat}")
    private String meat;

    @RequestMapping("/json")
    public Object json(){
        Food food = new Food();
        food.setRice(rice);
        food.setMeat(meat);
        return food;
    }
}
