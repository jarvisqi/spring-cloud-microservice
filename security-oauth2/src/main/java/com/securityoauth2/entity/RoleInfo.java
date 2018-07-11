package com.securityoauth2.entity;

import java.io.Serializable;

/**
 * 角色信息
 *
 * @author Jarvis
 * @date 2018/7/11
 */
public class RoleInfo implements Serializable {

    private static final long serialVersionUID = 6646946827613553839L;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String name;
    private String value;
}
