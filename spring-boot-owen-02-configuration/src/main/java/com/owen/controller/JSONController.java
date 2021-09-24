package com.owen.controller;

import com.owen.bean.Food;
import com.owen.bean.Fruit;
import com.owen.bean.Vegetables;
import com.owen.config.FruitConfig;
import com.owen.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }

    @Autowired
    private FruitConfig fruitConfig;

    @RequestMapping("/fruit")
    public Fruit fruit(){
        Fruit fruit = new Fruit();
        fruit.setApple(fruitConfig.getApple());
        fruit.setBanana(fruitConfig.getBanana());
        fruit.setOrange(fruitConfig.getOrange());
        return fruit;
    }
}
