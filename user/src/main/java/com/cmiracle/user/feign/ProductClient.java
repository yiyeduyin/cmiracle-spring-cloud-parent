package com.cmiracle.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("server-product")
public interface ProductClient {

    @GetMapping("/product/get")
    String hello(@RequestParam(name = "name") String name);
}
