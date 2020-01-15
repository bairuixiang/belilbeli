package com.bai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //启用网关
@EnableDiscoveryClient //注册服务
@EnableHystrixDashboard //基于hystrix实现服务状态监控
public class GatewatApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewatApplication.class,args);
    }
}
