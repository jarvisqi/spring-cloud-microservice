package com.userservice.controller;

import com.userservice.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jarvis
 * @date 2018/7/18
 */
@RestController
public class UserOrderController {

    @Autowired
    private UserOrderService orderService;

    @RequestMapping(value = "/getUserOrder", method = RequestMethod.GET)
    public String getUserOrder() {
        return orderService.getOrder();
    }
}
