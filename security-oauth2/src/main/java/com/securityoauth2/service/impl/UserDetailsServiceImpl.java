package com.securityoauth2.service.impl;

import com.securityoauth2.entity.AuthUser;
import com.securityoauth2.entity.AuthRole;
import com.securityoauth2.service.AuthUserService;
import com.securityoauth2.service.AuthRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Jarvis
 * @date 2018/7/11
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AuthUserService userService;

    @Autowired
    private AuthRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser authUser = userService.findByUsername(username);
        if (authUser == null) {
            throw new UsernameNotFoundException("用户: " + username + " 不存在!");
        }
        //权限点
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        List<AuthRole> roleResult = roleService.getRoleByUserId(authUser.getId());
        if (roleResult != null) {
            for (AuthRole role : roleResult) {
                //角色必须是ROLE_开头，可以在数据库中设置
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + role.getValue());
                grantedAuthorities.add(grantedAuthority);
                //获取权限
                //TODO

            }
        }

        /**
         *  boolean enabled = true;  可用性 :true:可用 false:不可用
         *  boolean accountNonExpired = true;  过期性 :true:没过期 false:过期
         *  boolean credentialsNonExpired = true;  有效性 :true:凭证有效 false:凭证无效
         *  boolean accountNonLocked = true;  锁定性 :true:未锁定 false:已锁定
         */
        User userDetail = new User(authUser.getUsername(), authUser.getPassword(), true,
                true, true, true, grantedAuthorities);
        return userDetail;
    }
}
