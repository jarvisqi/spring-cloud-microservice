package com.softmax.eurekafeignhystrix.controller;

import com.softmax.eurekafeignhystrix.service.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hystrix 服务
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@RestController
public class FeignHystrixController {
    @Autowired
    private UserClient client;

    /**
     * 添加信息 服务失败跳转到 hystrixError
     * HystrixCommand 注解在Feign中不需要使用
     *
     * @return int
     */
    @HystrixCommand(fallbackMethod = "hystrixError")
    @RequestMapping("/getHystrix")
    public String getHystrix() {
        //addUser 会失败
        int result = client.addUser();
        return Integer.toString(result);
    }

    /**
     * hystrix 服务失败跳转到此
     *
     * @return string
     */
    public String hystrixError() {
        return "FeignHystrix / hystrix(): Service Unavailable";
    }
}

