package com.example.demo.config;

import com.example.demo.service.MemcachedClient;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhangyanqing
 * @desc
 * @date 2018/08/05
 */
public class ConditionalOnExistBean implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getBeanFactory().getBean(MemcachedClient.class) != null;
    }
}
