package com.cjb.dao;

import com.cjb.pojo.Bulletin;

public interface BulletinMapper {
    int deleteByPrimaryKey(Integer bulletinId);

    int insert(Bulletin record);

    int insertSelective(Bulletin record);

    Bulletin selectByPrimaryKey(Integer bulletinId);

    int updateByPrimaryKeySelective(Bulletin record);

    int updateByPrimaryKey(Bulletin record);
}