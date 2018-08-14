package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@Service
public class MemcachedClient {
    public void saveKey(){
        System.out.println("key saved succeed!");
    }
}
