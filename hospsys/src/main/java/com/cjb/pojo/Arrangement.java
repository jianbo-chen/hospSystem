package com.cjb.pojo;

import java.util.Date;

public class Arrangement {
    private Integer arrgtId;

    private Integer arrgtDoctorId;

    private Date arrgtDate;

    private String arrgtPeriod;

    private Date arrgtStarttime;

    private Date arrgtEndtime;

    private Integer arrgtPlannum;

    private Integer arrgtLastnum;

    public Integer getArrgtId() {
        return arrgtId;
    }

    public void setArrgtId(Integer arrgtId) {
        this.arrgtId = arrgtId;
    }

    public Integer getArrgtDoctorId() {
        return arrgtDoctorId;
    }

    public void setArrgtDoctorId(Integer arrgtDoctorId) {
        this.arrgtDoctorId = arrgtDoctorId;
    }

    public Date getArrgtDate() {
        return arrgtDate;
    }

    public void setArrgtDate(Date arrgtDate) {
        this.arrgtDate = arrgtDate;
    }

    public String getArrgtPeriod() {
        return arrgtPeriod;
    }

    public void setArrgtPeriod(String arrgtPeriod) {
        this.arrgtPeriod = arrgtPeriod == null ? null : arrgtPeriod.trim();
    }

    public Date getArrgtStarttime() {
        return arrgtStarttime;
    }

    public void setArrgtStarttime(Date arrgtStarttime) {
        this.arrgtStarttime = arrgtStarttime;
    }

    public Date getArrgtEndtime() {
        return arrgtEndtime;
    }

    public void setArrgtEndtime(Date arrgtEndtime) {
        this.arrgtEndtime = arrgtEndtime;
    }

    public Integer getArrgtPlannum() {
        return arrgtPlannum;
    }

    public void setArrgtPlannum(Integer arrgtPlannum) {
        this.arrgtPlannum = arrgtPlannum;
    }

    public Integer getArrgtLastnum() {
        return arrgtLastnum;
    }

    public void setArrgtLastnum(Integer arrgtLastnum) {
        this.arrgtLastnum = arrgtLastnum;
    }
}