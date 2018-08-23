package com.softmax.eurekafeign.controller;

import com.softmax.eurekafeign.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 调用feign 绑定的user-service 服务
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@RestController
public class UserController {
    @Autowired
    private UserClient client;

    @RequestMapping(value = "/getUser")
    public String getUser() {
        return client.getUserInfo();
    }
}
