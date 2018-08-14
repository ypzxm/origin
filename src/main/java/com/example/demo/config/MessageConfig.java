package com.example.demo.config;

import com.example.demo.service.MessageService;
import com.example.demo.service.MessageServiceImpl;
import com.example.demo.service.PrimaryMessageService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@Configuration
@ComponentScan(basePackageClasses = {MessageServiceImpl.class, PrimaryMessageService.class, UserService.class})
public class MessageConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    @Qualifier("pPrimaryMessageService")
    public MessageService messageService(){
        return new PrimaryMessageService();
    }
}
