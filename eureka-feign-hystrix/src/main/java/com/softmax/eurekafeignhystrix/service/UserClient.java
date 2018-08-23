package com.softmax.eurekafeignhystrix.service;

import com.softmax.eurekafeignhystrix.service.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * feign 注解来绑定该接口对应user-service服务
 * name为其它服务的服务名称
 * fallback为熔断后的回调
 * FeignClient fallback 和 HystrixCommand 方式二选一
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@FeignClient(value = "user-service", fallback = UserClientFallback.class)
public interface UserClient {

    /**
     * 获取信息
     *
     * @return string
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    String getUserInfo();

    /**
     * 添加信息
     *
     * @return string
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    int addUser();
}
