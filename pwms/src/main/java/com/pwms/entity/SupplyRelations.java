package com.pwms.entity;

import java.io.Serializable;

/**
 * 供应关系表(SupplyRelations)实体类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public class SupplyRelations implements Serializable {
    private static final long serialVersionUID = 279429359452040499L;
    /**
     * 供应关系编号
     */
    private Integer id;
    /**
     * 商家编号，外键，关联商家信息表
     */
    private Integer merchantId;
    /**
     * 涂料编号，外键，关联涂料信息表
     */
    private Integer paintId;
    /**
     * 供应单价
     */
    private Double price;
    /**
     * 供应备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getPaintId() {
        return paintId;
    }

    public void setPaintId(Integer paintId) {
        this.paintId = paintId;
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

