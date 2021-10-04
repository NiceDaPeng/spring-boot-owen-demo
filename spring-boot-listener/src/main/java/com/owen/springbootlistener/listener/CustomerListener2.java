package com.owen.springbootlistener.listener;

import com.owen.springbootlistener.event.CustomerEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener2 implements ApplicationListener<CustomerEvent> {
    @Override
    public void onApplicationEvent(CustomerEvent event) {
        event.printMessage("监听器2监听到了");
    }
}
