package com.bai.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    int i;

    @HystrixCommand(fallbackMethod = "jiang")//开启熔断器 配置降级方法 对应降级方法名
    @GetMapping("hello")
    public String test(){
        i++;
        if (i%3==0) {
            System.out.println(1/0);
        }
        return "ok";
    }
    public String jiang(){
        return "接口异常";
    }
}
