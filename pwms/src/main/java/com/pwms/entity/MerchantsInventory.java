package com.pwms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商家库存表(MerchantsInventory)实体类
 *
 * @author makejava
 * @since 2023-04-06 18:42:25
 */
public class MerchantsInventory implements Serializable {
    private static final long serialVersionUID = -89403774187025478L;
    
    private Integer id;
    
    private Integer merchantId;
    
    private Integer paintId;
    
    private Integer quantity;
    
    private Date lastInDate;
    
    private Date lastOutDate;
    
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

