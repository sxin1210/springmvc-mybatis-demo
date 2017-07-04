package com.test.userinfo.service;
import com.test.userinfo.entity.User;
/**
 * Created by songxin07 on 17/6/20.
 */
public interface UserService {
    User login(String loginname,String password);
    int register(String loginname, String password, String username,String phone,String address);
    int updateUserInfo(String username,int id);
    int deleteUserByID(int id);
}
