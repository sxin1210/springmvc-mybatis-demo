package com.test.userinfo;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.test.userinfo.entity.User;

/**
 * Created by songxin07 on 17/6/17.
 */
public class MyBatisTest {
    public static void main(String[] args) throws Exception {
        // 读取mybatis-config.xml文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 初始化mybatis，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建Session实例
        SqlSession session = sqlSessionFactory.openSession();

        //测试INSERT
        // 创建User对象
//        User user = new User("Bob", "女", 43);
        // 插入数据，test对应UserMapper.xml中的namespace，save对应insert的id
//        session.insert("test.addUser", user);

        //测试SELECT
        User user = session.selectOne("test.selectUser",1);
        System.out.println(user);

        //测试UPDATE
//        User user = session.selectOne("test.selectUser",5);
//        user.setName("update");
//        session.update("test.updateUser", user);

        //测试DELET
//        session.delete("deleteUser",7);

        // 提交事务
        session.commit();
        // 关闭Session
        session.close();
    }
}
