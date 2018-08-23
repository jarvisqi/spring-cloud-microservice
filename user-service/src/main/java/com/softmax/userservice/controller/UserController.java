package com.softmax.userservice.controller;

import com.softmax.userservice.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser() {
        logger.info("-------- request user-service/getUser --------");
        return "Success, User-Service, Port :" + port;
    }

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public UserInfo getInfo() {
        UserInfo info = new UserInfo();
        info.setId(1001);
        info.setName("Spring: " + port);
        info.setEmial("Spring@email.com");

        return info;
    }

}
