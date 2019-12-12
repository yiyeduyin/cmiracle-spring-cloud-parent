package com.cmiracle.order.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/order/get")
    @PreAuthorize("hasAuthority('all')")
    public String oauth() {
        return "hello " + System.currentTimeMillis();
    }
}
