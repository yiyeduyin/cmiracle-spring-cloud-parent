package com.cmiracle.authauthenticationservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义token携带内容
 */
@Component
public class CustomTokenEnhancer implements TokenEnhancer {

    @Value("${jwt.isskey}")
    private String issKey;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) accessToken;
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        Map<String, Object> more = new HashMap<>();
        more.put("iss", issKey);
        more.put("is_admin", userDetails.isAdmin());
        more.put("ent_code", userDetails.getEntCode());
        token.setAdditionalInformation(more);
        return accessToken;
    }
}