package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public abstract class WebMvcConfigurer {

    @GetMapping("/")
    public String index() {
        return "/";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
