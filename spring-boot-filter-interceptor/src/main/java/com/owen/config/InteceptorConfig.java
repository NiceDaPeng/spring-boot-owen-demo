package com.owen.config;


import com.owen.filter.CustomerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InteceptorConfig implements WebMvcConfigurer {

    @Autowired
    private CustomerInterceptor customerInterceptor;


    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(customerInterceptor).addPathPatterns("/**");
    }

}
