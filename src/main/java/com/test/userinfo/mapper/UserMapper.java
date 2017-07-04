package com.test.userinfo.mapper;

import com.test.userinfo.entity.User;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * Created by songxin07 on 17/6/20.
 */
@Repository
public interface UserMapper {
    @Select("select * from tb2_user where loginname = #{loginname} and password = #{password}")
    User findWithLoginnameAndPassword(@Param("loginname")String loginname,
                                      @Param("password") String password);

    @Insert("insert into tb2_user(loginname,password,username,phone,address) values (#{loginname},#{password},#{username},#{phone},#{address})")
    int addUser(@Param("loginname")String loginname, @Param("password")String password,
                 @Param("username")String username,@Param("phone")String phone,@Param("address")String address);

    @Update("update tb2_user set username=#{username} where id=#{id}")
    int updateUserNameByID(@Param("username")String username,@Param("id")int id);

    @Delete("delete from tb2_user where id=#{id}")
    int deleteUserByID(@Param("id")int id);
}
