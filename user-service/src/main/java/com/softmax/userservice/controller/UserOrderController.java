package com.softmax.userservice.controller;

import com.softmax.userservice.service.UserOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderService orderService;

    @RequestMapping(value = "/getUserOrder", method = RequestMethod.GET)
    public String getUserOrder() {
        logger.info("log info:user/getUserOrder");
        logger.error("log error:user/getUserOrder");
        logger.debug("log debug:user/getUserOrder");

        return orderService.getOrder();
    }
}
