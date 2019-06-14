package com.cmiracle.authauthenticationservice.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/13 00 38
 * @Description:
 */
@Configuration
public class AuthFeignConfiguration {

    private String clientId = "client_01";

    private String clientSecret = "123456";

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(clientId, clientSecret);
    }
}
