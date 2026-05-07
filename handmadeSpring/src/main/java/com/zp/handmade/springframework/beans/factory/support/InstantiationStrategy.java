package com.zp.handmade.springframework.beans.factory.support;

import com.zp.handmade.springframework.beans.BeansException;
import com.zp.handmade.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author : zhengpanone
 * Date : 2026/5/8 00:43
 * Version : v1.0.0
 * Description:
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
