package com.suyao.arch_web.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *  1.使用ribbon
 * @Classname RestTemplateConfig
 * @Description TODO
 * @Date 2022/8/2 17:31
 * @Created by B105
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate () {
        return new RestTemplate();
    }
}
