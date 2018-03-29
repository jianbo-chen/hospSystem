package com.cjb.pojo;

import java.util.Date;

public class Reservation {
    private Integer reservationId;

    private Integer reservationOrderId;

    private String reservationName;

    private String reservationSex;

    private String reservationIdnum;

    private Integer reservationPhone;

    private String reservationDept;

    private String reservationDoctor;

    private Date reservationDate;

    private String reservationPeriod;

    private Date reservationStarttime;

    private Date reservationEndtime;

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getReservationOrderId() {
        return reservationOrderId;
    }

    public void setReservationOrderId(Integer reservationOrderId) {
        this.reservationOrderId = reservationOrderId;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName == null ? null : reservationName.trim();
    }

    public String getReservationSex() {
        return reservationSex;
    }

    public void setReservationSex(String reservationSex) {
        this.reservationSex = reservationSex == null ? null : reservationSex.trim();
    }

    public String getReservationIdnum() {
        return reservationIdnum;
    }

    public void setReservationIdnum(String reservationIdnum) {
        this.reservationIdnum = reservationIdnum == null ? null : reservationIdnum.trim();
    }

    public Integer getReservationPhone() {
        return reservationPhone;
    }

    public void setReservationPhone(Integer reservationPhone) {
        this.reservationPhone = reservationPhone;
    }

    public String getReservationDept() {
        return reservationDept;
    }

    public void setReservationDept(String reservationDept) {
        this.reservationDept = reservationDept == null ? null : reservationDept.trim();
    }

    public String getReservationDoctor() {
        return reservationDoctor;
    }

    public void setReservationDoctor(String reservationDoctor) {
        this.reservationDoctor = reservationDoctor == null ? null : reservationDoctor.trim();
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationPeriod() {
        return reservationPeriod;
    }

    public void setReservationPeriod(String reservationPeriod) {
        this.reservationPeriod = reservationPeriod == null ? null : reservationPeriod.trim();
    }

    public Date getReservationStarttime() {
        return reservationStarttime;
    }

    public void setReservationStarttime(Date reservationStarttime) {
        this.reservationStarttime = reservationStarttime;
    }

    public Date getReservationEndtime() {
        return reservationEndtime;
    }

    public void setReservationEndtime(Date reservationEndtime) {
        this.reservationEndtime = reservationEndtime;
    }
}