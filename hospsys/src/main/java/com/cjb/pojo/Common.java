package com.cjb.pojo;

import java.util.Date;

public class Common {
    private Integer commonId;

    private Integer commonOrderId;

    private Integer commonPatienUid;

    private Integer commonDoctorUid;

    private Date commonTime;

    private String commonContent;

    private String commonDrAttitude;

    private String commonEfficacy;

    private String commonDiseasetype;

    public Integer getCommonId() {
        return commonId;
    }

    public void setCommonId(Integer commonId) {
        this.commonId = commonId;
    }

    public Integer getCommonOrderId() {
        return commonOrderId;
    }

    public void setCommonOrderId(Integer commonOrderId) {
        this.commonOrderId = commonOrderId;
    }

    public Integer getCommonPatienUid() {
        return commonPatienUid;
    }

    public void setCommonPatienUid(Integer commonPatienUid) {
        this.commonPatienUid = commonPatienUid;
    }

    public Integer getCommonDoctorUid() {
        return commonDoctorUid;
    }

    public void setCommonDoctorUid(Integer commonDoctorUid) {
        this.commonDoctorUid = commonDoctorUid;
    }

    public Date getCommonTime() {
        return commonTime;
    }

    public void setCommonTime(Date commonTime) {
        this.commonTime = commonTime;
    }

    public String getCommonContent() {
        return commonContent;
    }

    public void setCommonContent(String commonContent) {
        this.commonContent = commonContent == null ? null : commonContent.trim();
    }

    public String getCommonDrAttitude() {
        return commonDrAttitude;
    }

    public void setCommonDrAttitude(String commonDrAttitude) {
        this.commonDrAttitude = commonDrAttitude == null ? null : commonDrAttitude.trim();
    }

    public String getCommonEfficacy() {
        return commonEfficacy;
    }

    public void setCommonEfficacy(String commonEfficacy) {
        this.commonEfficacy = commonEfficacy == null ? null : commonEfficacy.trim();
    }

    public String getCommonDiseasetype() {
        return commonDiseasetype;
    }

    public void setCommonDiseasetype(String commonDiseasetype) {
        this.commonDiseasetype = commonDiseasetype == null ? null : commonDiseasetype.trim();
    }
}