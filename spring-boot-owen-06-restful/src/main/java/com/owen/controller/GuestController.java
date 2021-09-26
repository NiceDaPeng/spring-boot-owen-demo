package com.owen.controller;


import com.owen.bean.Guest;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model){
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }
//  添加操作
//    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

//    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @PostMapping
    public String add(Guest guest){

        guestService.add(guest);
        return "redirect:/guest";

    }

//    修改操作
//    @RequestMapping(value = "/toUpdate/{name}",method = RequestMethod.GET)
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute(guest);
        return "update";
    }

//    @RequestMapping("/update")
    @PutMapping
    public String update(Guest guest ){

        guestService.update(guest);
        return "redirect:/guest";

    }

    //    删除操作
//    @RequestMapping("/delete")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }

}
