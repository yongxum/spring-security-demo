package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "你好!";
    }

    @GetMapping("/see")
    public String see(){
        return "你叫什么?";
    }

}
