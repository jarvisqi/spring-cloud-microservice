package com.securityoauth2;

import com.securityoauth2.service.AuthUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

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
