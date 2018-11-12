package com.demo.demo2.pojo;

import java.util.Date;

public class Goods {
    private Long id;

    private String goodsname;

    private Integer billstatus;

    private Integer goodsdistrict;

    private Double goodsprice;

    private Long goodscount;

    private Date creationtime;

    public Goods(Long id, String goodsname, Integer billstatus, Integer goodsdistrict, Double goodsprice, Long goodscount, Date creationtime) {
        this.id = id;
        this.goodsname = goodsname;
        this.billstatus = billstatus;
        this.goodsdistrict = goodsdistrict;
        this.goodsprice = goodsprice;
        this.goodscount = goodscount;
        this.creationtime = creationtime;
    }

    public Goods() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public Integer getGoodsdistrict() {
        return goodsdistrict;
    }

    public void setGoodsdistrict(Integer goodsdistrict) {
        this.goodsdistrict = goodsdistrict;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Long getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Long goodscount) {
        this.goodscount = goodscount;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
}