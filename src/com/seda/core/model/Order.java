package com.seda.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private Long id;

    private Long supplyId;

    private String ordCofulNm;

    private String ordDat;

    private String ordNo;

    private BigDecimal tamt;

    private Long createBy;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Long supplyId) {
        this.supplyId = supplyId;
    }

    public String getOrdCofulNm() {
        return ordCofulNm;
    }

    public void setOrdCofulNm(String ordCofulNm) {
        this.ordCofulNm = ordCofulNm;
    }

    public String getOrdDat() {
        return ordDat;
    }

    public void setOrdDat(String ordDat) {
        this.ordDat = ordDat;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo;
    }

    public BigDecimal getTamt() {
        return tamt;
    }

    public void setTamt(BigDecimal tamt) {
        this.tamt = tamt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}