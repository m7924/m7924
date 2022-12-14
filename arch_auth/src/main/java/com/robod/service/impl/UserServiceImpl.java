package com.robod.service.impl;

import com.robod.entity.SysUser;
import com.robod.mapper.UserMapper;
import com.robod.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Base64;

/**
 * @author Robod
 * @date 2020/8/9 17:48
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }*/

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = userMapper.findByUsername(username);
        return sysUser;
    }


}
