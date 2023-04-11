package com.pwms.entity;

import java.io.Serializable;

/**
 * 供应关系表(SupplyRelations)实体类
 *
 * @author makejava
 * @since 2023-04-09 13:00:58
 */
public class SupplyRelations implements Serializable {
    private static final long serialVersionUID = -52850209930592263L;
    /**
     * 供应关系编号
     */
    private Integer id;
    /**
     * 供应商编号
     */
    private Integer supplierId;
    /**
     * 涂料编号
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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

