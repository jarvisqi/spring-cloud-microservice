package com.userservice.service.fallback;

import com.userservice.service.UserOrderService;
import org.springframework.stereotype.Component;

/**
 * @author Jarvis
 * @date 2018/7/18
 */
@Component
public class UserOrderFallback implements UserOrderService {

    /**
     * 取user的订单列表
     *
     * @return
     */
    @Override
    public String getOrder() {

        return "User / getOrder() : Service Unavailable";
    }
}
