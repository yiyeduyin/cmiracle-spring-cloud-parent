package com.cmiracle.authresourceservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


//    @Value("${jwt.signkey}")
//    private String signKey;
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().authenticated();//配置order访问控制，必须认证过后才可以访问
//    }
//
//    @Bean
//    public JwtAccessTokenConverter accessTokenConverter() {
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        converter.setSigningKey(signKey);
//        return converter;
//    }
//
//    @Bean
//    public TokenStore tokenStore() {
//        //基于jwt实现令牌（Access Token）
//        return new JwtTokenStore(accessTokenConverter());
//    }
//
//    @Bean
//    @Primary
//    public ResourceServerTokenServices tokenService() {
//        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//        defaultTokenServices.setTokenStore(tokenStore());
//        defaultTokenServices.setSupportRefreshToken(true);
//        return defaultTokenServices;
//    }
}
