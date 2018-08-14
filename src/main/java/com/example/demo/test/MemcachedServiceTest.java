package com.example.demo.test;

import com.example.demo.config.MemcachedConfig;
import com.example.demo.service.MemcachedService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MemcachedConfig.class)
public class MemcachedServiceTest {
    @Autowired
    private MemcachedService memcachedService;

    @Test
    public void testExistBean(){
        memcachedService.saveKey();
        Assert.assertTrue(memcachedService != null);
    }
}
