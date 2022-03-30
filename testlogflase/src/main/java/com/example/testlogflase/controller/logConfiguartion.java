package com.example.testlogflase.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.example.testlogflase.controller")
public class logConfiguartion {
    public logConfiguartion(){
        System.out.println("logConfiguration初始化");
    }

}
