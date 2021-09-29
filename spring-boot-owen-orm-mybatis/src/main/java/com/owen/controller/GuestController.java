package com.owen.controller;


import com.owen.bean.Guest;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/list")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String guestList(Model model){

        List<Guest> guestList = guestService.findAll();
        model.addAttribute("guestList",guestList);
        return "list";
    }
}
