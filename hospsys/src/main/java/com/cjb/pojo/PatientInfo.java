package com.cjb.pojo;

public class PatientInfo {
    private Integer patientinfoId;

    private String patientinfoIdNum;

    private String patientinfoPhone;

    private Integer patientinfoUid;

    private String patientinfoSex;

    public Integer getPatientinfoId() {
        return patientinfoId;
    }

    public void setPatientinfoId(Integer patientinfoId) {
        this.patientinfoId = patientinfoId;
    }

    public String getPatientinfoIdNum() {
        return patientinfoIdNum;
    }

    public void setPatientinfoIdNum(String patientinfoIdNum) {
        this.patientinfoIdNum = patientinfoIdNum == null ? null : patientinfoIdNum.trim();
    }

    public String getPatientinfoPhone() {
        return patientinfoPhone;
    }

    public void setPatientinfoPhone(String patientinfoPhone) {
        this.patientinfoPhone = patientinfoPhone == null ? null : patientinfoPhone.trim();
    }

    public Integer getPatientinfoUid() {
        return patientinfoUid;
    }

    public void setPatientinfoUid(Integer patientinfoUid) {
        this.patientinfoUid = patientinfoUid;
    }

    public String getPatientinfoSex() {
        return patientinfoSex;
    }

    public void setPatientinfoSex(String patientinfoSex) {
        this.patientinfoSex = patientinfoSex == null ? null : patientinfoSex.trim();
    }
}