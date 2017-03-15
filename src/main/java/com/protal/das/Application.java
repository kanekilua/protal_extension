package com.protal.das;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by KILUA on 2017/2/28.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.protal.das.dao")
@ComponentScan(basePackages = "com.protal.das.service")
@ComponentScan(basePackages = "com.protal.das.controller")
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}
