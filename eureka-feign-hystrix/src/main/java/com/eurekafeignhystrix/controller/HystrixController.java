package com.eurekafeignhystrix.controller;

import com.eurekafeignhystrix.service.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hystrix 服务
 *
 * @author : Jarvis
 * @date : 2018/6/25
 */
@RestController
public class HystrixController {
    @Autowired
    private UserClient client;

    /**
     * 添加信息 服务失败跳转到 hystrixError
     *
     * @return int
     */
    @HystrixCommand(fallbackMethod = "hystrixError")
    @RequestMapping("/hystrix")
    public String hystrix() {
        int result = client.addUser();
        return Integer.toString(result);
    }

    /**
     * hystrix 服务失败跳转到此
     *
     * @return string
     */
    public String hystrixError() {
        return "Hystrix hystrix(): Service Unavailable";
    }
}

