package com.softmax.hystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * spring cloud, 使用 Turbine 对服务的 Hystrix数据进行聚合
 *
 * @author Jarvis
 * @date 2018/06/28
 */
@EnableTurbine
@SpringBootApplication
public class HystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
    }
}
