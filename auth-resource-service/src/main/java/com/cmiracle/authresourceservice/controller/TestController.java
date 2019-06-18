package com.cmiracle.authresourceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/product/get")
    public String hello() {
        return "hello " + System.currentTimeMillis();
    }

    @GetMapping("/order/get")
    public String oauth() {
        return "hello " + System.currentTimeMillis();
    }
}
