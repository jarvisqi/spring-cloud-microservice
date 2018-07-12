package com.securityoauth2.service;

import com.securityoauth2.entity.AuthRole;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Jarvis
 * @date 2018/7/11
 */
@Component
public interface AuthRoleService {
    /**
     * 取用户角色信息
     *
     * @param userId
     * @return
     */
    List<AuthRole> getRoleByUserId(@PathVariable("userId") Integer userId);
}
