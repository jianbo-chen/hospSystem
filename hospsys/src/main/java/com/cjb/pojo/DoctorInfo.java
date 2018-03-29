package com.cjb.pojo;

public class DoctorInfo {
    private Integer doctorinfoId;

    private Integer doctorinfoUid;

    private String doctorinfoIntro;

    private String doctorinfoProDirect;

    private Integer doctorinfoDeptId;

    private Integer doctorinfoTitleId;

    public Integer getDoctorinfoId() {
        return doctorinfoId;
    }

    public void setDoctorinfoId(Integer doctorinfoId) {
        this.doctorinfoId = doctorinfoId;
    }

    public Integer getDoctorinfoUid() {
        return doctorinfoUid;
    }

    public void setDoctorinfoUid(Integer doctorinfoUid) {
        this.doctorinfoUid = doctorinfoUid;
    }

    public String getDoctorinfoIntro() {
        return doctorinfoIntro;
    }

    public void setDoctorinfoIntro(String doctorinfoIntro) {
        this.doctorinfoIntro = doctorinfoIntro == null ? null : doctorinfoIntro.trim();
    }

    public String getDoctorinfoProDirect() {
        return doctorinfoProDirect;
    }

    public void setDoctorinfoProDirect(String doctorinfoProDirect) {
        this.doctorinfoProDirect = doctorinfoProDirect == null ? null : doctorinfoProDirect.trim();
    }

    public Integer getDoctorinfoDeptId() {
        return doctorinfoDeptId;
    }

    public void setDoctorinfoDeptId(Integer doctorinfoDeptId) {
        this.doctorinfoDeptId = doctorinfoDeptId;
    }

    public Integer getDoctorinfoTitleId() {
        return doctorinfoTitleId;
    }

    public void setDoctorinfoTitleId(Integer doctorinfoTitleId) {
        this.doctorinfoTitleId = doctorinfoTitleId;
    }
}