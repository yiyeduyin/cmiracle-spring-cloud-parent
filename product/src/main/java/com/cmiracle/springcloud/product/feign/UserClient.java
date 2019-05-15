package com.cmiracle.springcloud.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-user")
public interface UserClient {

    @GetMapping("/user/get")
    String hello(@RequestParam(name = "name") String name);
}
