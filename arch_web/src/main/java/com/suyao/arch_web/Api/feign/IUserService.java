package com.suyao.arch_web.Api.feign;

import com.suyao.arch_common.entity.sys.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname IUserService
 * @Description TODO
 * @Date 2022/8/8 17:08
 * @Created by B105
 */
@FeignClient(value="arch-server", contextId = "IUserService")
public interface IUserService {

    @RequestMapping(value = "/findByUsername")
    SysUser findByUsername(@RequestParam("username") String username) ;
}
