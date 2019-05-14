package com.cmiracle.springcloud.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class TestController {

    @GetMapping("/get")
    public String hello(){
        return "hello product";
    }

}
