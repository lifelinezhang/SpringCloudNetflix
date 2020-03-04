package com.zhang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  // 在服务启动后自动注册到eureka中
@EnableDiscoveryClient // 服务发现
public class DeptService_8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptService_8003.class, args);
    }
}
