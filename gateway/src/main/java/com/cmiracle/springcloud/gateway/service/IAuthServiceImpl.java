package com.cmiracle.springcloud.gateway.service;

import com.cmiracle.springcloud.commonutil.dao.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.InvalidSignatureException;
import org.springframework.security.jwt.crypto.sign.MacSigner;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/4 15 06
 * @Description:
 */
@Service
public class IAuthServiceImpl implements IAuthService {

    private final String[] permits = new String[]{"/oauth", "/login","/logout","/actuator/**","/swagger-ui.html","/webjars/**","/swagger-resources/**", "/v2/**", "/feign/**"};

    @Value("${jwt.signkey}")
    private String signKey;

    /**
     * Authorization认证开头是"bearer "
     */
    private static final int BEARER_BEGIN_INDEX = 7;

    /**
     * 不需要网关签权的url配置(/oauth,/open)
     * 默认/oauth开头是不需要的
     */
    private String ignoreUrls = "/oauth";

    /**
     * jwt验签
     */
    private MacSigner verifier;

    @Override
    public Result authenticate(String authentication, String url, String method) {
        return null;
//        return authProvider.auth(authentication, url, method);
    }

    @Override
    public boolean ignoreAuthentication(String url) {
        return Stream.of(this.ignoreUrls.split(","))
                .anyMatch(ignoreUrl -> url.startsWith(StringUtils.trim(ignoreUrl)));
    }

    @Override
    public boolean hasPermission(Result authResult) {
        return authResult.isSuccess() && (boolean) authResult.getData();
    }

    @Override
    public boolean invalidJwtAccessToken(String authentication) {
        verifier = Optional.ofNullable(verifier).orElse(new MacSigner(signKey));
        //是否无效true表示无效
        boolean invalid = Boolean.TRUE;

        try {
            Jwt jwt = getJwt(authentication);
            jwt.verifySignature(verifier);
            invalid = Boolean.FALSE;
        } catch (InvalidSignatureException | IllegalArgumentException ex) {
            System.out.println("user token has expired or signature error ");
        }
        return invalid;
    }

    @Override
    public boolean hasPermission(String authentication, String url, String method) {
        //token是否有效
        if (invalidJwtAccessToken(authentication)) {
            return Boolean.FALSE;
        }
        return true;
        //从认证服务获取是否有权限
//        return hasPermission(authenticate(authentication, url, method));
    }

    @Override
    public Jwt getJwt(String authentication) {
        return JwtHelper.decode(StringUtils.substring(authentication, BEARER_BEGIN_INDEX));
    }
}
