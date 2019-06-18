package com.cmiracle.authresourceservice.service;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/16 00 25
 * @Description:
 */
public interface AuthService {

    boolean invalidJwtAccessToken(String authentication);
}
