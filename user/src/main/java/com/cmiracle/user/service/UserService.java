package com.cmiracle.user.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface UserService {

    @PostMapping(value = "/getUser")
    String getUser(@RequestBody String name);


    @PostMapping(value = "/updateUser")
    String updateUser(@RequestBody String name);
}
