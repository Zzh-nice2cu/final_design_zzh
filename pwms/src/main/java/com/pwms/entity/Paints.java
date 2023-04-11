package com.pwms.entity;

import java.io.Serializable;

/**
 * 涂料信息表(Paints)实体类
 *
 * @author makejava
 * @since 2023-04-09 13:00:56
 */
public class Paints implements Serializable {
    private static final long serialVersionUID = -91803832770955056L;
    /**
     * 涂料编号
     */
    private Integer id;
    /**
     * 涂料名称
     */
    private String name;
    /**
     * 涂料品牌
     */
    private String brand;
    /**
     * 涂料类型
     */
    private String type;
    /**
     * 涂料计量单位
     */
    private String unit;
    /**
     * 涂料备注
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

