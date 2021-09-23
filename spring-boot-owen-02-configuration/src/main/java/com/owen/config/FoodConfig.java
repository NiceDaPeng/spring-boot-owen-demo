package com.owen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * prefix前缀指的是在配置文件中的第一级
 */
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {

    private String rice;
    private String meat;

}
