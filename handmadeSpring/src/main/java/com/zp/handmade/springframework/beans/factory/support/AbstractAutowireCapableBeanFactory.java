package com.zp.handmade.springframework.beans.factory.support;

import com.zp.handmade.springframework.BeansException;
import com.zp.handmade.springframework.beans.factory.config.BeanDefinition;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 22:17
 * Version : v1.0.0
 * Description: 实例化Bean类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of class [" + beanDefinition.getBeanClass() + "] failed");
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
