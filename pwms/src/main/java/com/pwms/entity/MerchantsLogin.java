package com.pwms.entity;

import java.io.Serializable;

/**
 * 商家登陆表(MerchantsLogin)实体类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public class MerchantsLogin implements Serializable {
    private static final long serialVersionUID = 215474798614750938L;
    /**
     * 商家编号，主键，自增
     */
    private Integer id;
    /**
     * 商家用户名，非空
     */
    private String username;
    /**
     * 商家密码，非空
     */
    private String password;


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

}

