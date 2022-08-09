package com.suyao.arch_web.security.service;


import com.alibaba.fastjson.JSONObject;

import com.suyao.arch_common.entity.sys.SysUser;
import com.suyao.arch_web.Api.feign.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Robod
 * @date 2020/8/9 17:48
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserService iUserService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = iUserService.findByUsername(username);
        String json = JSONObject.toJSONString(sysUser);
        return JSONObject.parseObject(json, com.suyao.arch_web.security.vo.SysUser.class);
    }


}
