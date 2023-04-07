package com.pwms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 涂料信息表(Paints)实体类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */

@Data
@TableName("paints")
public class Paints implements Serializable {
    private static final long serialVersionUID = 262937269431564894L;
    /**
     * 涂料编号，主键，自增长
     */
    private Integer id;
    /**
     * 涂料名称，非空
     */
    private String name;
    /**
     * 涂料品牌，非空
     */
    private String brand;
    /**
     * 涂料类型，非空
     */
    private String type;
    /**
     * 涂料计量单位，非空
     */
    private String unit;
    /**
     * 涂料单价，非空
     */
    private Double price;
    /**
     * 涂料备注，可为空
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

