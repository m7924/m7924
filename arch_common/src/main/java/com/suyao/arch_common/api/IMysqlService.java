package com.suyao.arch_common.api;

import com.suyao.arch_common.config.FeignConfiguration;
import com.suyao.arch_common.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Classname IMysqlService
 * @Description TODO
 * @Date 2022/8/3 16:15
 * @Created by B105
 */
@FeignClient(value="arch-server", contextId = "IMysqlService", configuration = FeignConfiguration.class)
public interface IMysqlService {
    @RequestMapping(value = "/addUser")
    public int addUser(@RequestParam("username") String username);

    @RequestMapping(value = "/allUser")
    public List<User> getAllUsers();
}
