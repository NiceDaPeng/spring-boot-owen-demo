package com.owen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "fruit")
@PropertySource("classpath:fruit.yml")
public class FruitConfig {

    private String orange;
    private String banana;
    private String apple;
}
