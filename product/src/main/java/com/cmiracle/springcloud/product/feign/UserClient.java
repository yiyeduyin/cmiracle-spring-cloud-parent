package com.cmiracle.springcloud.product.feign;

import com.cmiracle.user.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient("service-user")
public interface UserClient extends UserService {


}
