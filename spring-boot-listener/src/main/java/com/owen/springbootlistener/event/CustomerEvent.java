package com.owen.springbootlistener.event;

import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent {

    public CustomerEvent(Object source) {
        super(source);
    }

    public void printMessage(String msg){
        System.out.println("监听到了时间了"+msg);
    }
}
