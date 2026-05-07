package com.zp.handmade.springframework.beans.factory.support;

import com.zp.handmade.springframework.beans.factory.config.BeanDefinition;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 22:55
 * Version : v1.0.0
 * Description:
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
