package com.softmax.eurekafeignhystrix.controller;

import com.softmax.eurekafeignhystrix.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * user-service 服务
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@RestController
public class UserController {
    @Autowired
    private UserClient client;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser() {
        return client.getUserInfo();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int addUser() {
        return client.addUser();
    }
}
