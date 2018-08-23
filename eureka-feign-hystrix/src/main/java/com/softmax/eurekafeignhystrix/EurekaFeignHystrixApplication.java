package com.softmax.eurekafeignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign + Hystrix 实现服务容错保护
 * EnableCircuitBreaker 断路器，不需要在主类使用@EnableCircuitBreaker，Feign已自动开启该功能
 * 不需要在FeignClient的interface上使用 @HystrixCommand，已隐含
 * EnableFeignClients  负载均衡客户端
 * EnableDiscoveryClient 服务发现注册
 *
 * @author Jarvis
 * @date 2018/06/25
 */
@EnableCircuitBreaker
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignHystrixApplication.class, args);
    }

}
