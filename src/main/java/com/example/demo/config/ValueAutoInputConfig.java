package com.example.demo.config;

import com.example.demo.model.UserBean;
import com.example.demo.model.UserBeanQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/13
 */
@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackageClasses = {UserBean.class, UserBeanQuery.class})
public class ValueAutoInputConfig {

}
