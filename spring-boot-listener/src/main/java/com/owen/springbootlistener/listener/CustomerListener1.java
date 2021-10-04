package com.owen.springbootlistener.listener;

import com.owen.springbootlistener.event.CustomerEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component   component注解是通过注解来加载监听器
public class CustomerListener1 implements ApplicationListener<CustomerEvent> {
    @Override
    public void onApplicationEvent(CustomerEvent event) {
        event.printMessage("event执行了");
    }
}
