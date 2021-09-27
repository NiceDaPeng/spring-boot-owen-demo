package com.owen.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "food")
@PropertySource("classpath:application.yml")
public class FoodConfig {

    private String apple;
    private String orange;
    private String pear;
}
