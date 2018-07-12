package com.securityoauth2.service.impl;

import com.securityoauth2.entity.AuthUser;
import com.securityoauth2.service.AuthUserService;
import org.springframework.stereotype.Service;

/**
 * @author Jarvis
 * @date 2018/7/12
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {
    /**
     * 用户名查找用户信息
     *
     * @param username
     * @return
     */
    @Override
    public AuthUser findByUsername(String username) {
        return null;
    }
}
