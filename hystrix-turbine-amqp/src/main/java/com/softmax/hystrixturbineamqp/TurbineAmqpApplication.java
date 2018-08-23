package com.softmax.hystrixturbineamqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * spring cloud 使用 RabbitMQ 基于消息代理的Turbine聚合服务
 *
 * @author Jarvis
 * @date 2018/06/28
 */
@EnableTurbineStream
@SpringBootApplication
public class TurbineAmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineAmqpApplication.class, args);
    }
}
