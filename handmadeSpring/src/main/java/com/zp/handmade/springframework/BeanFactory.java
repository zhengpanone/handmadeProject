package com.zp.handmade.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 21:50
 * Version : v1.0.0
 * Description: Bean工厂
 * 包括了Bean的注册和获取
 */
public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
