package com.cjb.dao;

import com.cjb.pojo.Title;

public interface TitleMapper {
    int deleteByPrimaryKey(Integer titleId);

    int insert(Title record);

    int insertSelective(Title record);

    Title selectByPrimaryKey(Integer titleId);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}