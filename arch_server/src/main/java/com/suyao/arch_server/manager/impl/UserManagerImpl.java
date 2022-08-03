package com.suyao.arch_server.manager.impl;

import com.suyao.arch_common.entity.User;
import com.suyao.arch_server.manager.UserManager;
import com.suyao.arch_server.mysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2022/7/28 18:00
 * @Created by B105
 */
@Service
public class UserManagerImpl implements UserManager {
    @Autowired(required = false)
    private UserMapper userMapper;

    public User getUserById(Long id){
        return userMapper.getUserById(id);
    }

    public int insert(User user){
        return userMapper.insert(user);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    public int delete(String id){
        return userMapper.delete(id);
    }

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }
}
