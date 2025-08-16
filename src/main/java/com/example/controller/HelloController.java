package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! ";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Hello World!";
    }
}
