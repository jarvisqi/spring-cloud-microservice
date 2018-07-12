package com.securityoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * spring cloud OAuth2.0 授权认证
 *
 * @author Jarvis
 * @date 2018/07/11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SecurityOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOauth2Application.class, args);
    }
}
