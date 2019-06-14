package com.cmiracle.authauthenticationservice.controller;

import com.cmiracle.authauthenticationservice.feign.OauthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private OauthService oauthService;

    @GetMapping("/oauth/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        log.info("into LoginController login");
        String token = oauthService.login(username, password, "password");
        log.info("LoginController login token = {}", token);
        return "hello " + token;
    }
}
