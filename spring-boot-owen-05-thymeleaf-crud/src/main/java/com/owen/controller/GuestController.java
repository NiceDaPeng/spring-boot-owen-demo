package com.owen.controller;


import com.owen.bean.Guest;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }
//  添加操作
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";

    }

//    修改操作
    @RequestMapping("/toUpdate")
    public String toUpdate(Model model,String name){
        Guest guest = guestService.get(name);
        model.addAttribute("roles", guestService.roles());
        model.addAttribute(guest);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Guest guest ){

        guestService.update(guest);
        return "redirect:/guest/list";

    }

    //    删除操作
    @RequestMapping("/delete")
    public String delete(@RequestParam("name") String name){
        guestService.delete(name);
        return "redirect:/guest/list";
    }


}
