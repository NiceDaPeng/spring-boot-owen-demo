package com.owen.springbootlistener;

import com.owen.springbootlistener.listener.CustomerListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootListenerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootListenerApplication.class, args);
        context.addApplicationListener(new CustomerListener1());
    }

}
