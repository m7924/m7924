package com.suyao.arch_web.controller;

import com.suyao.arch_common.api.IMysqlService;
import com.suyao.arch_common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * @Classname UserController
 * @Description TODO
 * @Date 2022/7/28 18:02
 * @Created by B105
 */
@RestController
public class RemoteMysqlController {
    @Autowired
    private IMysqlService userService;

    @RequestMapping(value = "/add")
    public int addUser(String username){
        int result = userService.addUser(username);
        return result;
    }

    @RequestMapping(value = "/all")
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }
}
