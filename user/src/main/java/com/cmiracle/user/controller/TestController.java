package com.cmiracle.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String test() {
        return restTemplate.getForObject("http://service-product/product/get", String.class);
    }
}
