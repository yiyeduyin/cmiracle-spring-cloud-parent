package com.cmiracle.springcloud.gateway.service;

import com.cmiracle.springcloud.commonutil.dao.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/4 15 06
 * @Description:
 */
@Service
public class IAuthServiceImpl implements IAuthService {

    private final String[] permits = new String[]{"/oauth", "/login","/logout","/actuator/**","/swagger-ui.html","/webjars/**","/swagger-resources/**", "/v2/**", "/feign/**"};

    /**
     * 不需要网关签权的url配置(/oauth,/open)
     * 默认/oauth开头是不需要的
     */
    private String ignoreUrls = "/oauth";

    @Override
    public Result authenticate(String authentication, String url, String method) {
        return null;
    }

    @Override
    public boolean ignoreAuthentication(String url) {
        return Stream.of(this.ignoreUrls.split(","))
                .anyMatch(ignoreUrl -> url.startsWith(StringUtils.trim(ignoreUrl)));
    }

    @Override
    public boolean hasPermission(Result authResult) {
        return false;
    }

    @Override
    public boolean invalidJwtAccessToken(String authentication) {
        return false;
    }

    @Override
    public boolean hasPermission(String authentication, String url, String method) {
        return false;
    }

    @Override
    public OAuth2ResourceServerProperties.Jwt getJwt(String authentication) {
        return null;
    }
}
