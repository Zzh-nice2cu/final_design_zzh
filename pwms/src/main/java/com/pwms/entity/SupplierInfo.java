package com.pwms.entity;

import java.io.Serializable;

/**
 * 供应商信息表(SupplierInfo)实体类
 *
 * @author makejava
 * @since 2023-04-09 13:00:57
 */
public class SupplierInfo implements Serializable {
    private static final long serialVersionUID = -83193072538467357L;
    /**
     * 供应商编号
     */
    private Integer id;
    /**
     * 供应商名称
     */
    private String name;
    /**
     * 供应商地址
     */
    private String address;
    /**
     * 供应商电话
     */
    private String phone;
    /**
     * 供应商邮箱
     */
    private String email;
    /**
     * 供应商联系人姓名
     */
    private String contactPerson;
    /**
     * 供应商联系人电话
     */
    private String contactPhone;
    /**
     * 供应商备注
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

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

