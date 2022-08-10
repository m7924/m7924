package com.suyao.arch_server.controller;

import com.suyao.arch_common.api.IUserService;
import com.suyao.arch_common.entity.sys.SysUser;
import com.suyao.arch_server.mysql.mapper.sys.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname SecurityController
 * @Description TODO
 * @Date 2022/8/8 17:03
 * @Created by B105
 */
@Slf4j
@RestController
public class SecurityController implements IUserService {

    @Autowired
    private UserMapper userMapper;

    //@RequestMapping(value = "/findByUsername")
    @Override
    public SysUser findByUsername(@RequestParam("username") String username) {
        SysUser sysUser = userMapper.findByUsername(username);
        return sysUser;
    }
}
