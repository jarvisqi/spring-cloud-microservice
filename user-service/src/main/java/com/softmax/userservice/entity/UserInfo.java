package com.softmax.userservice.entity;


/**
 * user 信息
 *
 * @author Jarvis
 * @date 2018/6/25
 */
public class UserInfo {

    private Integer id;
    private String name;
    private String emial;

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

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
}
