package com.owen.listener;

import com.owen.event.CustomerEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//通过Component声明这是一个需要加载的监听器。
@Component
public class CustomerListener2 implements ApplicationListener<CustomerEvent> {
    @Override
    public void onApplicationEvent(CustomerEvent customerEvent) {
        customerEvent.printMessage("CustomerListener2监听到了");
    }
}
