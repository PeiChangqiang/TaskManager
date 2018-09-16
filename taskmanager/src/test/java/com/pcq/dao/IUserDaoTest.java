package com.pcq.dao;

import com.pcq.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {


    @Autowired
    private IUserDao userDao;

    @Test
    public void testGetUserById() {
        User user = userDao.getUserById(1);
        if(null != user) {
            System.out.println("姓名:" + user.getName());
        }
    }
}