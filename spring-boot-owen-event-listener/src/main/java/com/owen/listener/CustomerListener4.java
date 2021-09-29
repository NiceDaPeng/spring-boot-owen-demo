package com.owen.listener;

import com.owen.event.CustomerEvent;
import org.springframework.context.ApplicationListener;

public class CustomerListener4 implements ApplicationListener<CustomerEvent> {
    @Override
    public void onApplicationEvent(CustomerEvent event) {
        event.printMessage("CustomerListener4执行了");
    }
}
