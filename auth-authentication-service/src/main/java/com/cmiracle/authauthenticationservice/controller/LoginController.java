package com.cmiracle.authauthenticationservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Value("${server.port}")
    private Integer port;

    @Value("${security.oauth2.client.client-id}")
    private String clientId;

    @Value("${security.oauth2.client.client-secret}")
    private String clientSecret;

    @GetMapping("/oauth/login")
    public OAuth2AccessToken loginTemplate(@RequestParam String username, @RequestParam String password) {
        log.info("into LoginController login");
        ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();
        resource.setAccessTokenUri(getLocalhostService() + "/oauth/token");
        resource.setClientId(clientId);
        resource.setClientSecret(clientSecret);
        resource.setGrantType("password");
        resource.setUsername(username);
        resource.setPassword(password);
        OAuth2RestTemplate template = new OAuth2RestTemplate(resource);
        template.setAccessTokenProvider(new ResourceOwnerPasswordAccessTokenProvider());
        OAuth2AccessToken accessToken = template.getAccessToken();
        log.info("LoginController login token = {}", accessToken);
        return accessToken;
    }

    private String getLocalhostService() {
        return "http://localhost:" + port;
    }
}
