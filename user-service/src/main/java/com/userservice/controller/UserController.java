package com.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jarvis
 * @date 2018/6/25
 */
@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser() {
        return "Success, Spring Cloud Service, Port :" + port;
    }

}
