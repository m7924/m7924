package com.suyao.arch_common.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 契约配置
 * @Classname FeignConfiguration
 * @Description TODO
 * @Date 2022/8/10 16:31
 * @Created by B105
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }

}
