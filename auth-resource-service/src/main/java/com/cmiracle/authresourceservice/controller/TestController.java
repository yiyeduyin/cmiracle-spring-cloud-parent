package com.cmiracle.authresourceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/resource/getUser")
    public String getUser(@RequestParam String name){
        return "resource " + name;
    }
}
