package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/14
 */
@Service
public class UserBeanQuery {
    @Value("#{userBean.getName()?: 'defaultName'}")
    private String userName;

    @Value("#{T(java.lang.Math).random()*20}")
    private int age;

    @Value("#{userBean.email matches '[a-zA-Z0-9_]+@[a-zA-Z_]+\\.com'}")
    private boolean isTrueEmail;


    public String getUserName(){
        System.out.println(userName);
        return userName;
    }

    public int getUserAge(){
        return age;
    }

    public Boolean isTrueEmail(){
        return isTrueEmail;
    }
}
