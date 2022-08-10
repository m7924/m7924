package com.suyao.arch_common.api;

import com.suyao.arch_common.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * 2.使用feign
 * @Classname IHkService
 * @Description TODO
 * @Date 2022/8/2 17:42
 * @Created by B105
 */
@FeignClient(value="arch-server", contextId = "IHkService", configuration = FeignConfiguration.class)
public interface IHkService {

    @GetMapping("/query/cameras/{name}")
    public String queryCameras(@PathVariable("name") String name);
}
