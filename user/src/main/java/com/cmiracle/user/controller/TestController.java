package com.cmiracle.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "【管理端：测试管理】", description = "测试管理")
@RestController
@RequestMapping("/user")
public class TestController {

    @ApiOperation(value = "管理端：测试获取")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String test(@RequestParam String name) {
        return name;
    }


}
