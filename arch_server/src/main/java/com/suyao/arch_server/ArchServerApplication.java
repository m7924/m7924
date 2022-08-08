package com.suyao.arch_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.suyao.arch_server.mysql.mapper.sys")
@EnableDiscoveryClient//表示当前服务是一个Eureka的客户端。  注册中心重启后服务会丢失，需要重新注册
@SpringBootApplication
public class ArchServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchServerApplication.class, args);
    }

}
