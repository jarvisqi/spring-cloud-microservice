package com.securityoauth2.entity;

import java.io.Serializable;

/**
 * 资源信息
 *
 * @author Jarvis
 * @date 2018/7/12
 */
public class AuthResource implements Serializable {

    private static final long serialVersionUID = -4177172273636348827L;
    
    private String id;
    private String code;
    private String parentCode;
    private String parentId;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

}
