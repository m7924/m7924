package com.suyao.arch_common.config;

import com.alibaba.fastjson.JSONObject;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Feign自定义拦截器
 * @Classname FeignBasicAuthRequestInterceptor
 * @Description TODO
 * @Date 2022/8/10 17:32
 * @Created by B105
 */
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
    private static Logger logger = LoggerFactory.getLogger(FeignBasicAuthRequestInterceptor.class);
    public FeignBasicAuthRequestInterceptor() {
    }

    @Override
    public void apply(RequestTemplate template) {
        // 业务逻辑
        logger.info("RequestTemplate==========================>"+template.toString());
        logger.info("RequestTemplate==========================>"+template.bodyTemplate());
        logger.info("RequestTemplate==========================>"+JSONObject.toJSONString(template.feignTarget()));

    }
}