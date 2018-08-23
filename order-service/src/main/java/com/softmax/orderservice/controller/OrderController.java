package com.softmax.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * order 服务
 *
 * @author Jarvis
 * @date 2018/7/13
 */
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    public String getOrder() {
        return "Success, Order-Service, Port :" + port;
    }
}
