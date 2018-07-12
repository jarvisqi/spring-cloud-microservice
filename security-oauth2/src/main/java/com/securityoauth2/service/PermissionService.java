package com.securityoauth2.service;

import com.securityoauth2.entity.AuthResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Jarvis
 * @date 2018/7/12
 */
@Component
public interface PermissionService {
    /**
     * 取角色的权限
     *
     * @param roleId
     * @return
     */
    List<AuthResource> getRolePermission(@PathVariable("roleId") Integer roleId);
}
