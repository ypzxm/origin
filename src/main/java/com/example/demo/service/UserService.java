package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.xml.ws.RequestWrapper;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@Component
public class UserService {
    @Autowired
    @Qualifier("pPrimaryMessageService")
    private MessageService primaryMessageService;

    public String play(){
        String message = "UserService "+primaryMessageService.printMessage();
        System.out.println(message);
        return message;
    }

}
