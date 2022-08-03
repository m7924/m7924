package com.suyao.arch_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //Eureka注册中心 表示当前服务是一个Eureka的服务端。
@SpringBootApplication
public class ArchEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchEurekaServerApplication.class, args);
    }

}
