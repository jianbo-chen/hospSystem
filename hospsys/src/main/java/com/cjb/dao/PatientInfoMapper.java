package com.cjb.dao;

import com.cjb.pojo.PatientInfo;

public interface PatientInfoMapper {
    int deleteByPrimaryKey(Integer patientinfoId);

    int insert(PatientInfo record);

    int insertSelective(PatientInfo record);

    PatientInfo selectByPrimaryKey(Integer patientinfoId);

    int updateByPrimaryKeySelective(PatientInfo record);

    int updateByPrimaryKey(PatientInfo record);
}