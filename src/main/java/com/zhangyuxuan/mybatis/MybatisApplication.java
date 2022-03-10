package com.zhangyuxuan.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MybatisApplication.class, args);
        test3_1();
    }

    private static void test3_1() {
        String source = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User userParam = new User();
            userParam.setSchoolName("shigaozhong");
            List<User> userList = userMapper.queryUserBySchoolName(userParam);
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }

}
