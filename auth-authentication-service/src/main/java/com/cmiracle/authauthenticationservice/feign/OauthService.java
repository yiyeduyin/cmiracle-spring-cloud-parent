package com.cmiracle.authauthenticationservice.feign;

import com.cmiracle.authauthenticationservice.config.AuthFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/12 22 19
 * @Description:
 */
@Component
@FeignClient(value = "service-auth-authentication", configuration = AuthFeignConfiguration.class)
public interface OauthService {

    @GetMapping(value = "/oauth/token")
    String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("grant_type") String grantType);

}
