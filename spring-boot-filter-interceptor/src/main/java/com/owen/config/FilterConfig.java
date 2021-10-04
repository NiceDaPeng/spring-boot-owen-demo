package com.owen.config;

import com.owen.filter.CustomerFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomerFilter> filterRegistrationBean(){
        FilterRegistrationBean<CustomerFilter> filter = new FilterRegistrationBean<>();
        filter.setFilter(new CustomerFilter());
        filter.addUrlPatterns("/*");
        return filter;
    }
}
