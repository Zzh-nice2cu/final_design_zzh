package com.pwms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商家库存表(MerchantsInventory)实体类
 *
 * @author makejava
 * @since 2023-04-09 13:00:55
 */
public class MerchantsInventory implements Serializable {
    private static final long serialVersionUID = 280416465011995171L;
    /**
     * 库存编号
     */
    private Integer id;
    /**
     * 商家编号
     */
    private Integer merchantId;
    /**
     * 涂料编号
     */
    private Integer paintId;
    /**
     * 当前库存数量
     */
    private Integer quantity;
    /**
     * 最近入库时间
     */
    private Date lastInDate;
    /**
     * 最近出库时间
     */
    private Date lastOutDate;
    /**
     * 库存备注
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getLastInDate() {
        return lastInDate;
    }

    public void setLastInDate(Date lastInDate) {
        this.lastInDate = lastInDate;
    }

    public Date getLastOutDate() {
        return lastOutDate;
    }

    public void setLastOutDate(Date lastOutDate) {
        this.lastOutDate = lastOutDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

