package com.owen.controller;

import com.owen.bean.Food;
import com.owen.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("/list")
    @ResponseBody
    public Food food(){

        Food food = new Food();
        food.setApple(foodConfig.getApple());
        food.setOrange(foodConfig.getOrange());
        food.setPear(foodConfig.getPear());
        return food;
    }

    @Value("${info.username}")
    private String username;

    @Value("${info.password}")
    private String password;

    @RequestMapping("/encryptor")
    @ResponseBody
    public String jasypt(){
        StringBuilder sb = new StringBuilder();
        sb.append(username);
        sb.append("/t");
        sb.append(password);
        return sb.toString();
    }
}
