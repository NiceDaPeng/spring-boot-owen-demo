package com.owen.controller;

import com.owen.bean.Guest;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController  {

    @Autowired
    private GuestService guestService;

    @GetMapping("")
    public String findAll(Model model){

        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "/add";
    }

    @Transactional
    @PostMapping("/add")
    public String add(Guest guest){
        guestService.save(guest);
        System.out.println(1/0);
        return "redirect:/guest";
    }

}
