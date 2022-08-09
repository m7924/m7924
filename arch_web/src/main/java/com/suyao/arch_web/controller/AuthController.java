package com.suyao.arch_web.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Robod
 * @date 2020/8/8 23:51
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Secured("ROLE_PRODUCT")
    @RequestMapping("/findAll")
    public String findAll() {
        return "产品列表查询成功";
    }

}