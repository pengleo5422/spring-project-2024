package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.example.model","com.example.Controller","com.example.Service","com.example.Repository"})
@EntityScan({"com.example.demo","com.example.model","com.example.Controller","com.example.Service","com.example.Repository"})
public class SpringProject2026Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringProject2026Application.class, args);
    }

}