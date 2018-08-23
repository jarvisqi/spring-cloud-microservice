package com.softmax.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * user-service 负载均衡服务
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@RestController
public class UserClientController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "getUser")
    public String home() {
        String results = restTemplate.getForObject("http://user-service/getUser", String.class);
        return results;
    }
}
