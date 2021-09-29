package com.owen.listener;

import com.owen.event.CustomerEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//方式三，不需要实现ApplicationListener接口

/**
 * 但是先声明@Component，需要被加载
 * 通过在方法上增加@EventListener声明这是一个监听组件。
 * 监听的事件是方法的参数。
 */
@Component
public class CustomerListener3 {

    @EventListener
    public void eventListener(CustomerEvent event){

        event.printMessage("CustomerListener3监听到了");

    }
}
