package com.cjb.pojo;

import java.util.Date;

public class Permission {
    private Integer permissionId;

    private String permissionName;

    private Date permissionCreatetime;

    private Date permissionUpdatetime;

    private String permissionDesc;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public Date getPermissionCreatetime() {
        return permissionCreatetime;
    }

    public void setPermissionCreatetime(Date permissionCreatetime) {
        this.permissionCreatetime = permissionCreatetime;
    }

    public Date getPermissionUpdatetime() {
        return permissionUpdatetime;
    }

    public void setPermissionUpdatetime(Date permissionUpdatetime) {
        this.permissionUpdatetime = permissionUpdatetime;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc == null ? null : permissionDesc.trim();
    }
}