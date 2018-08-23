package com.softmax.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * spring cloud 负载均衡，使用Feign 实现
 *
 * @author Jarvis
 * @date 2018/06/25
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

}
