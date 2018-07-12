package com.securityoauth2.service;

import com.securityoauth2.entity.AuthUser;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * AuthUser 服务
 *
 * @author Jarvis
 * @date 2018/7/11
 */
@Component
public interface AuthUserService {
    /**
     * 用户名查找用户信息
     *
     * @param username
     * @return
     */
    AuthUser findByUsername(@PathVariable("username") String username);
}
