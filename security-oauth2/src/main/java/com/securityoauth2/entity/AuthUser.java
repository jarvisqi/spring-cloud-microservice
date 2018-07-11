package com.securityoauth2.entity;

import java.io.Serializable;

/**
 * 授权用户信息
 *
 * @author Jarvis
 * @date 2018/7/11
 */
public class AuthUser implements Serializable {

    private static final long serialVersionUID = -8577562083364859404L;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
}
