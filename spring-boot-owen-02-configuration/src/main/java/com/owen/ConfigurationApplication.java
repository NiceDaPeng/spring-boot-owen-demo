package com.owen;


import com.owen.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FoodConfig.class)
public class ConfigurationApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigurationApplication.class,args);
    }
}
