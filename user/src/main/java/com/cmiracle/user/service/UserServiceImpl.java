package com.cmiracle.user.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getUser(String name) {
        return name + " get";
    }

    @Override
    public String updateUser(String name) {
        return name + " update";
    }
}
