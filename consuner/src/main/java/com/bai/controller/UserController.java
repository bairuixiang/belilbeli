package com.bai.controller;


import com.bai.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "实现请求",tags = "实现请求")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "熔断器接口")
    @RequestMapping("api/user/ex")
    public String ex(){
        return userService.ex();
    }
}
