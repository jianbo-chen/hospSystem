package com.cjb.dao;

import com.cjb.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author cjb
 * @date 2018/2/1
 */
public interface UserMapperCustom {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    User userLogin(@Param("username")String username, @Param("password")String password);

    /**
     * 医生登录
     * @param username
     * @param password
     * @return
     */
    User doctorLogin(@Param("username")String username, @Param("password")String password);

    /**
     * 系统管理员登录
     * @param username
     * @param password
     * @return
     */
    User systemLogin(@Param("username")String username, @Param("password")String password);

    /**
     * 超级管理员登录
     * @param username
     * @param password
     * @return
     */
    User adminLogin(@Param("username")String username, @Param("password")String password);
}
