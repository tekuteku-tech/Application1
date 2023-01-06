package com.example.demo.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.demo" })
public class Application1Application {

    public static void main(String[] args) {
        SpringApplication.run(Application1Application.class, args);
        System.out.println("main終了");
    }

}
