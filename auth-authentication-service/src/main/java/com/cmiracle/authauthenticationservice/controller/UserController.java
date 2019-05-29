package com.cmiracle.authauthenticationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/oauth")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        return principal;
    }
}