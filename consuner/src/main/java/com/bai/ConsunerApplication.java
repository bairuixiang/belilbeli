package com.bai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2     //启用swagger
@EnableDiscoveryClient     //发现和注册服务
@EnableFeignClients     //调用服务提供者
public class ConsunerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsunerApplication.class,args);
    }
}
