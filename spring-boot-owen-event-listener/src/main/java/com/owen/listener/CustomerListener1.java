package com.owen.listener;

import com.owen.event.CustomerEvent;
import org.springframework.context.ApplicationListener;

public class CustomerListener1 implements ApplicationListener<CustomerEvent> {


    @Override
    public void onApplicationEvent(CustomerEvent customerEvent) {
        customerEvent.printMessage("CustomerListener1这个类监听到了");
    }
}
