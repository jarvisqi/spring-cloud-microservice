package com.softmax.eurekaribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * spring cloud 负载均衡,使用 ribbon 实现
 *
 * @author : Jarbibs
 * @date 2018/06/25
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonApplication.class, args);
    }
}
