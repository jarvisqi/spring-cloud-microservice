package com.securityoauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * auth 认证接口
 *
 * @author Jarvis
 * @date 2018/7/11
 */
@RestController
public class AuthUserController {
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
