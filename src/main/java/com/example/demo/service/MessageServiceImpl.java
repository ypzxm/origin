package com.example.demo.service;

import com.example.demo.annotation.SubTypeQualifier;
import com.example.demo.annotation.TypeQualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@Component
@TypeQualifier("type1")
@SubTypeQualifier("subtype1")
public class MessageServiceImpl implements MessageService {
    @Value("${my.name}")
    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public String printMessage() {
        System.out.println(applicationName+"Method printMessage Invoke!");
        return applicationName+"  Message";
    }
}
