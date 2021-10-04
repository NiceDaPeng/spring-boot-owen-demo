package com.owen.springbootlistener.listener;

import com.owen.springbootlistener.event.CustomerEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener3  {

    public void onApplicationEvent(CustomerEvent event){

    }
}
