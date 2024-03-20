package com.example.easypos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class EasyPOS {
    public static void main(String[] args) {
        SpringApplication.run(EasyPOS.class, args);
    }

}
