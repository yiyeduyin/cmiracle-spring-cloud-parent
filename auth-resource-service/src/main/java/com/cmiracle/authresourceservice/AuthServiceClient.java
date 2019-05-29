package com.cmiracle.authresourceservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient("auth-service")
public class AuthServiceClient {
}
