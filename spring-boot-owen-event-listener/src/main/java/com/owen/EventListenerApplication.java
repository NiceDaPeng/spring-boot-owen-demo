package com.owen;

import com.owen.listener.CustomerListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventListenerApplication {

    public static void main(String[] args) {
//        获取启动后的容器，加载自定义监听器
        ConfigurableApplicationContext context = SpringApplication.run(EventListenerApplication.class, args);
        context.addApplicationListener(new CustomerListener1());
    }

}
