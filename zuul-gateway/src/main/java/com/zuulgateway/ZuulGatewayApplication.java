package com.zuulgateway;

import com.zuulgateway.filter.GatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * spring cloud zuul 网关
 *
 * @author Jarvis
 * @date 2018/07/13
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }

    @Bean
    public GatewayFilter gatewayFilterBean() {
        return new GatewayFilter();
    }
}
