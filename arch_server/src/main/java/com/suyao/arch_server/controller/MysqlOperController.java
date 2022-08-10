package com.suyao.arch_server.controller;

import com.suyao.arch_common.api.IMysqlService;
import com.suyao.arch_common.entity.User;
import com.suyao.arch_server.manager.UserManager;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Classname MysqlOperController
 * @Description TODO
 * @Date 2022/8/3 16:09
 * @Created by B105
 */
@Slf4j
@RestController
public class MysqlOperController implements IMysqlService {

    @Autowired
    private UserManager userService;

    //@RequestMapping(value = "/addUser")
    @Override
    public int addUser(@RequestParam("username") String username){
        User user = new User();
        //String id = UUID.randomUUID().toString().replace("-", "");
        user.setId(System.currentTimeMillis());
        user.setName(username);
        try{
            //new java.sql.Timestamp(new Date().getTime())
            user.setCreatedate(new Date());
        }catch (Exception e){

        }
        int result = userService.insert(user);
        return result;
    }

    //@RequestMapping(value = "/allUser")
    @Override
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

}
