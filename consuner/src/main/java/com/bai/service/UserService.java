package com.bai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("HelloProvider")//服务名
public interface UserService {
    @GetMapping("hello")
    String ex();
}
