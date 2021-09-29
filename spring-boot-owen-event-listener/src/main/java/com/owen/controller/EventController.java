package com.owen.controller;

import com.owen.event.CustomerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new CustomerEvent(this));
        return "Success";
    }
}
