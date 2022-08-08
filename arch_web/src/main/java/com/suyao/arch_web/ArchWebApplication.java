package com.suyao.arch_web;

import com.suyao.arch_web.security.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableConfigurationProperties(RsaKeyProperties.class)  //将配置类放入Spring容器中
@EnableMongoAuditing
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ArchWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchWebApplication.class, args);
    }

}
