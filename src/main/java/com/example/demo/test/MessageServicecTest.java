package com.example.demo.test;

import com.example.demo.DemoApplication;
import com.example.demo.annotation.SubTypeQualifier;
import com.example.demo.annotation.TypeQualifier;
import com.example.demo.config.MessageConfig;
import com.example.demo.service.MessageService;
import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MessageConfig.class)
@SpringBootTest(classes = DemoApplication.class)
public class MessageServicecTest {

    @Autowired
    @TypeQualifier("type1")
    @SubTypeQualifier("subtype1")
    private MessageService messageService;

    @Test
    public void printUserMessage(){
        Assert.assertTrue(messageService.printMessage().indexOf("hello  Message") != -1);
    }
}
