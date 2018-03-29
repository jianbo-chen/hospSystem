package com.cjb.pojo;

import java.util.Date;

public class Bulletin {
    private Integer bulletinId;

    private Integer bulletinContent;

    private Integer bulletinTitle;

    private Date bulletinCreatetime;

    private Date bulletinUpdatetime;

    private Integer bulletinUid;

    public Integer getBulletinId() {
        return bulletinId;
    }

    public void setBulletinId(Integer bulletinId) {
        this.bulletinId = bulletinId;
    }

    public Integer getBulletinContent() {
        return bulletinContent;
    }

    public void setBulletinContent(Integer bulletinContent) {
        this.bulletinContent = bulletinContent;
    }

    public Integer getBulletinTitle() {
        return bulletinTitle;
    }

    public void setBulletinTitle(Integer bulletinTitle) {
        this.bulletinTitle = bulletinTitle;
    }

    public Date getBulletinCreatetime() {
        return bulletinCreatetime;
    }

    public void setBulletinCreatetime(Date bulletinCreatetime) {
        this.bulletinCreatetime = bulletinCreatetime;
    }

    public Date getBulletinUpdatetime() {
        return bulletinUpdatetime;
    }

    public void setBulletinUpdatetime(Date bulletinUpdatetime) {
        this.bulletinUpdatetime = bulletinUpdatetime;
    }

    public Integer getBulletinUid() {
        return bulletinUid;
    }

    public void setBulletinUid(Integer bulletinUid) {
        this.bulletinUid = bulletinUid;
    }
}