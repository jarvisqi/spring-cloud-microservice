package com.securityoauth2.service;

import com.securityoauth2.entity.RoleInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Jarvis
 * @date 2018/7/11
 */
@Component(value = "roleMapper")
public interface RoleService {
    /**
     * 取用户角色信息
     *
     * @param userId
     * @return
     */
    List<RoleInfo> getRoleByUserId(@PathVariable("userId") Integer userId);
}
