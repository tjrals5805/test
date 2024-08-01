package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index() {
        return "index"; // src/main/resources/templates/index.html 파일을 반환
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}