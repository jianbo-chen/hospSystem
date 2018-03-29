package com.cjb.dao;

import com.cjb.pojo.Common;

public interface CommonMapper {
    int deleteByPrimaryKey(Integer commonId);

    int insert(Common record);

    int insertSelective(Common record);

    Common selectByPrimaryKey(Integer commonId);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);
}