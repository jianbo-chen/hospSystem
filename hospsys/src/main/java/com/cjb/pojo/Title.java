package com.cjb.pojo;

public class Title {
    private Integer titleId;

    private String titleName;

    private Double titleFee;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    public Double getTitleFee() {
        return titleFee;
    }

    public void setTitleFee(Double titleFee) {
        this.titleFee = titleFee;
    }
}