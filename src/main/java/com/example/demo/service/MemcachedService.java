package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MemcachedService {
    @Autowired
    private MemcachedClient client;

    public void saveKey(){
        client.saveKey();
    }
}
