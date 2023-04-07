package com.pwms.entity;

import java.io.Serializable;

/**
 * 商家信息表(MerchantsInfo)实体类
 *
 * @author makejava
 * @since 2023-04-06 18:42:24
 */
public class MerchantsInfo implements Serializable {
    private static final long serialVersionUID = 488240607602274605L;
    /**
     * 商家编号，主键，自增
     */
    private Integer id;
    /**
     * 商家名称，非空
     */
    private String name;
    /**
     * 商家地址，非空
     */
    private String address;
    /**
     * 商家电话，非空
     */
    private String phone;
    /**
     * 商家邮箱，可为空
     */
    private String email;
    /**
     * 商家备注，可为空
     */
    private String remark;


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

