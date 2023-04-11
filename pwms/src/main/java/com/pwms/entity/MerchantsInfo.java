package com.pwms.entity;

import java.io.Serializable;

/**
 * 商家信息表(MerchantsInfo)实体类
 *
 * @author makejava
 * @since 2023-04-09 13:00:36
 */
public class MerchantsInfo implements Serializable {
    private static final long serialVersionUID = 620925539525789781L;
    /**
     * 商家编号
     */
    private Integer id;
    /**
     * 商家用户名
     */
    private String username;
    /**
     * 商家密码
     */
    private String password;
    /**
     * 商家名称
     */
    private String name;
    /**
     * 商家地址
     */
    private String address;
    /**
     * 商家电话
     */
    private String phone;
    /**
     * 商家邮箱
     */
    private String email;
    /**
     * 商家备注
     */
    private String remark;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

