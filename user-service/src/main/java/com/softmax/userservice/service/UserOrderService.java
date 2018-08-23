package com.softmax.userservice.service;

import com.softmax.userservice.service.fallback.UserOrderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Jarvis
 * @date 2018/7/18
 */
@FeignClient(value = "order-service", fallback = UserOrderFallback.class)
public interface UserOrderService {
    /**
     * 取user的订单列表
     *
     * @return
     */
    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    String getOrder();
}
