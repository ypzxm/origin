package com.example.demo.config;

import com.example.demo.service.MemcachedService;
import com.example.demo.service.MemcachedClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@Configuration
@ComponentScan(basePackageClasses = {MemcachedClient.class})
public class MemcachedConfig {
    @Bean
    @Scope(value= WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.INTERFACES)
    public MemcachedService memcacheService(){
        return new MemcachedService();
    }

}
