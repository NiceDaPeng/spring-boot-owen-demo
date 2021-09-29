package com.owen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.owen.mapper")
//@MapperScan("com.owen.tk.mapper")
public class OrmMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMyBatisApplication.class, args);
    }

}
