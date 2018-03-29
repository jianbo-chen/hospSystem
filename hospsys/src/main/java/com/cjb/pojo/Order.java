package com.cjb.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderNo;

    private String orderSerialno;

    private Integer orderPatienUid;

    private Integer orderDoctorUid;

    private Integer orderArrgtId;

    private Double orderMoney;

    private Integer orderState;

    private Date orderCreatetime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderSerialno() {
        return orderSerialno;
    }

    public void setOrderSerialno(String orderSerialno) {
        this.orderSerialno = orderSerialno == null ? null : orderSerialno.trim();
    }

    public Integer getOrderPatienUid() {
        return orderPatienUid;
    }

    public void setOrderPatienUid(Integer orderPatienUid) {
        this.orderPatienUid = orderPatienUid;
    }

    public Integer getOrderDoctorUid() {
        return orderDoctorUid;
    }

    public void setOrderDoctorUid(Integer orderDoctorUid) {
        this.orderDoctorUid = orderDoctorUid;
    }

    public Integer getOrderArrgtId() {
        return orderArrgtId;
    }

    public void setOrderArrgtId(Integer orderArrgtId) {
        this.orderArrgtId = orderArrgtId;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }
}