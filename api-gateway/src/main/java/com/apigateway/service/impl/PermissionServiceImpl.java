package com.apigateway.service.impl;

import com.apigateway.service.PermissionService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 权限检查
 *
 * @author Jarvis
 * @date 2018/7/12
 */
@Service(value = "permissionService")
public class PermissionServiceImpl implements PermissionService {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    /**
     * 可以做URLs匹配，规则如下
     * <p>
     * ？匹配一个字符
     * *匹配0个或多个字符
     * **匹配0个或多个目录
     */
    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        String requestUrl = request.getRequestURI();
        List<SimpleGrantedAuthority> grantedAuthorityList = (List<SimpleGrantedAuthority>) authentication.getAuthorities();
        boolean hasPermission = false;
        if (principal != null) {
            if (CollectionUtils.isEmpty(grantedAuthorityList)) {
                return hasPermission;
            }
            for (SimpleGrantedAuthority authority : grantedAuthorityList) {
                if (antPathMatcher.match(authority.getAuthority(), requestUrl)) {
                    hasPermission = true;
                    break;
                }
            }
        }

        return hasPermission;
    }
}
