package com.cjb.dao;

import com.cjb.pojo.Arrangement;

public interface ArrangementMapper {
    int deleteByPrimaryKey(Integer arrgtId);

    int insert(Arrangement record);

    int insertSelective(Arrangement record);

    Arrangement selectByPrimaryKey(Integer arrgtId);

    int updateByPrimaryKeySelective(Arrangement record);

    int updateByPrimaryKey(Arrangement record);
}