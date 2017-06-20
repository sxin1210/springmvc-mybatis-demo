package com.test.userinfo;

import com.test.userinfo.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import com.test.userinfo.entity.User;

/**
 * Created by songxin07 on 17/6/19.
 */
public class AnnotationTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建Session实例
        SqlSession session = sqlSessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);

//        User user = new User();
//        user.setName("annotation222");
//        user.setSex("男");
//        user.setAge(88);
//        userDao.saveUser(user);
//        // 查看插入数据生成的主键
//        System.out.println("插入数据生成的主键id为：" + user.getId());

        User user = userDao.selectUserById(1);
        System.out.println(user);

        // 提交事务
        session.commit();
        // 关闭Session
        session.close();
    }

}
