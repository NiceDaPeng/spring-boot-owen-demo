package com.owen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springBootApplication声明这是一个入口类。
//并且声明是springboot项目
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        使用springApplication类的静态方法启动springboot程序，方法的参数有两个
//        程序的入口类和入口函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
