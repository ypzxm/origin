package com.example.demo.service;


import com.example.demo.annotation.SubTypeQualifier;
import com.example.demo.annotation.TypeQualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/06
 */
@Component
@TypeQualifier("type2")
@SubTypeQualifier("subtype2")
public class PrimaryMessageService implements MessageService{
    @Override
    public String printMessage() {
        System.out.println("method PrimaryMessageService.printMessage invoke!");
        return "PrimaryMessage";
    }
}
