package com.cmiracle.authauthenticationservice.feign.provider;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authoor: cmiracle
 * @Date: 2019/5/31 00 06
 * @Description:
 */
@RestController
public interface AuthService {

    /**
     * 判断用户是否有权限
     * @param authentication
     * @param url
     * @param method
     * @return
     */
    @PostMapping(value = "/auth/permission")
    Object auth(@RequestHeader(HttpHeaders.AUTHORIZATION) String authentication, @RequestParam("url") String url, @RequestParam("method") String method);

}
