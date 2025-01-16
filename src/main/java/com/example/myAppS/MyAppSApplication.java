package com.example.myAppS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class MyAppSApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyAppSApplication.class, args);
    }
}

