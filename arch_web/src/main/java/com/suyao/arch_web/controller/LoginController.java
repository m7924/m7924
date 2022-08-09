package com.suyao.arch_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2022/8/9 15:35
 * @Created by B105
 */
@Controller
public class LoginController {

    @GetMapping("/login/{status}")
    public String login(@PathVariable String status) {
        System.out.println(status);
        if("auth".equals(status)){
            return "login";
        }
        if("fail".equals(status)){
            return "login";
        }
        if("success".equals(status)){
            return "vedio/provinceVedio";
        }
        if("logout".equals(status)){
            return "login";
        }
        return "";
    }

}
