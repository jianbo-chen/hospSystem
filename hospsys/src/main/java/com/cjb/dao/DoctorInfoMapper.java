package com.cjb.dao;

import com.cjb.pojo.DoctorInfo;

public interface DoctorInfoMapper {
    int deleteByPrimaryKey(Integer doctorinfoId);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    DoctorInfo selectByPrimaryKey(Integer doctorinfoId);

    int updateByPrimaryKeySelective(DoctorInfo record);

    int updateByPrimaryKey(DoctorInfo record);
}