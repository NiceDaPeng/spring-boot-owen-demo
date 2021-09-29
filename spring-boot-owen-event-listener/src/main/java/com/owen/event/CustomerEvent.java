package com.owen.event;

import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent {

    public CustomerEvent(Object source){
        super(source);
    }

    public void printMessage(String msg){
        System.out.println("自定义事件打印信息"+msg);
    }
}
