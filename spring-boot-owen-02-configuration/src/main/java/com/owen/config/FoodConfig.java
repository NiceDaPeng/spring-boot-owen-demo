package com.owen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * prefix前缀指的是在配置文件中的第一级
 */
@Data
@Configuration
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String rice;
    private String meat;

}
