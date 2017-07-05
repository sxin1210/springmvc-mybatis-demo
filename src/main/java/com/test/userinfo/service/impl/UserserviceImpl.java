package com.test.userinfo.service.impl;

import com.test.userinfo.entity.User;
import com.test.userinfo.mapper.UserMapper;
import com.test.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by songxin07 on 17/6/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    //    @Override
    public User login(String loginname, String password) {
        return userMapper.findWithLoginnameAndPassword(loginname,password);
    }
    public int register(String loginname, String password, String username,String phone,String address){
        return userMapper.addUser(loginname,password,username,phone,address);
    }

    public int updateUserInfo(String username,int id){
        return userMapper.updateUserNameByID(username,id);
    }

    public int deleteUserByID(int id){
        return userMapper.deleteUserByID(id);
    }
}
