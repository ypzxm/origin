package com.example.demo.test;

import com.example.demo.config.ValueAutoInputConfig;
import com.example.demo.model.UserBean;
import com.example.demo.model.UserBeanQuery;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ValueAutoInputConfig.class)
public class UserBeanTest {
    @Autowired
    private UserBeanQuery userBeanQuery;


    @Test
    public void testQueryUserName(){
        Assert.assertTrue(userBeanQuery.getUserName().equals("defaultName"));
    }

    @Test
    public void testQueryUserAge() {
        System.out.println(userBeanQuery.getUserAge());
    }

    @Test
    public void testisTrueEmail() {
        Assert.assertTrue(userBeanQuery.isTrueEmail());
    }
}
