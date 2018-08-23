package com.softmax.eurekafeignhystrix.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 设置日日之级别
 *
 * @author Jarvis
 * @date 2018/6/27
 */
@Configuration
public class UserClientConfiguration {

    /**
     * Logger.Level有如下几种选择：
     * NONE, 不记录日志 (默认)。
     * BASIC, 只记录请求方法和URL以及响应状态代码和执行时间。
     * HEADERS, 记录请求和应答的头的基本信息。
     * FULL, 记录请求和响应的头信息，正文和元数据。
     *
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.HEADERS;
    }
}
