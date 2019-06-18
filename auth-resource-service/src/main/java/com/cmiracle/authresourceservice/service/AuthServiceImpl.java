package com.cmiracle.authresourceservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.InvalidSignatureException;
import org.springframework.security.jwt.crypto.sign.MacSigner;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/16 00 25
 * @Description:
 */
@Slf4j
@Service
public class AuthServiceImpl implements AuthService{

    @Value("${jwt.signkey}")
    private String signKey;

    /**
     * jwt验签
     */
    private MacSigner verifier;

    /**
     * 验证token
     */
    public boolean invalidJwtAccessToken(String authentication){
        verifier = Optional.ofNullable(verifier).orElse(new MacSigner(signKey));
        //是否无效true表示无效
        boolean invalid = Boolean.TRUE;

        try {
            Jwt jwt = getJwt(authentication);
            jwt.verifySignature(verifier);
            invalid = Boolean.FALSE;
        } catch (InvalidSignatureException | IllegalArgumentException ex) {
            log.warn("user token has expired or signature error ");
        }
        return invalid;
    }

    /**
     * 验证服务
     */
    public void invalidService(){

    }

    public Jwt getJwt(String authentication) {
        return JwtHelper.decode(authentication);
    }
}
