package com.robod;

import com.robod.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * SpringBoot整合Spring Security【超详细教程】 https://blog.csdn.net/weixin_43461520/article/details/107941983/
 * @author Robod
 * @date 2020/8/9 23:53
 */
@SpringBootApplication
@MapperScan("com.robod.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)  //将配置类放入Spring容器中
public class AuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);
    }

}
