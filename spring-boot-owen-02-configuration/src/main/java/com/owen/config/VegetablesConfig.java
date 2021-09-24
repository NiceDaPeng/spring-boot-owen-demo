package com.owen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * configuration:声明这是一个配置类，可以替代xml文件
 * configurationProperties声明这是一个配置类，并声明前缀
 * PropertySource
 */
@Data
@Configuration
@PropertySource("classpath:vegetables.yml")
@ConfigurationProperties(prefix = "vegetables")
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String greenpeper;
}
