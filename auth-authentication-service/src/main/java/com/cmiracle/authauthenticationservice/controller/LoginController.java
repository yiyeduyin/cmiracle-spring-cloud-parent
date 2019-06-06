package com.cmiracle.authauthenticationservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/sys/login")
    public String hello(){
        return "hello " + System.currentTimeMillis();
    }
}
