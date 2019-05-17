package com.cmiracle.springcloud.product.controller;

import com.cmiracle.springcloud.product.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class TestController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/get")
    public String getUser(@RequestParam String name){
        return userClient.getUser(name);
    }

    @GetMapping("/update")
    public String updateUser(@RequestParam String name){
        return userClient.updateUser(name);
    }

}
