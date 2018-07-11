package com.securityoauth2.service.impl;

import com.securityoauth2.entity.AuthUser;
import com.securityoauth2.service.AuthUserService;
import org.springframework.stereotype.Service;

/**
 * @author Jarvis
 * @date 2018/7/11
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {
    @Override
    public AuthUser findByUsername(String username) {
        return null;
    }
}
