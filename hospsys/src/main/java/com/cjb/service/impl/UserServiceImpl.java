package com.cjb.service.impl;

import com.cjb.common.Constant;
import com.cjb.common.ServerResponse;
import com.cjb.dao.UserMapper;
import com.cjb.dao.UserMapperCustom;
import com.cjb.pojo.User;
import com.cjb.pojo.vo.UserCustom;
import com.cjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @author cjb
 * @date 2018/2/1
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapperCustom userMapperCustom;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse userLogin(String username, String password) {
        User user=userMapperCustom.userLogin(username,password);
        if(user!=null){
            return ServerResponse.build(Constant.SUCCESS_CODE,"成功登录",user);
        }else{
            return ServerResponse.build(Constant.USER_LOGIN_FAIL,"账号或密码错误");
        }
    }

    /**
     * 医生登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse doctorLogin(String username, String password) {
        User user=userMapperCustom.doctorLogin(username,password);
        if(user!=null){
            return ServerResponse.build(Constant.SUCCESS_CODE,"成功登录",user);
        }else{
            return ServerResponse.build(Constant.USER_LOGIN_FAIL,"账号或密码错误");
        }
    }

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse adminLogin(String username, String password) {
         User user=userMapperCustom.systemLogin(username,password);
            if(user==null){
                user=userMapperCustom.adminLogin(username,password);
            }
        if(user!=null){
            return ServerResponse.build(Constant.SUCCESS_CODE,"成功登录",user);
        }else{
            return ServerResponse.build(Constant.USER_LOGIN_FAIL,"账号或密码错误");
        }
    }
}
