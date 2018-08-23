package com.softmax.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign 注解来绑定该接口对应user-service服务
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@FeignClient(value = "user-service")
public interface UserClient {

    /**
     * 获取信息
     *
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    String getUserInfo();

}
