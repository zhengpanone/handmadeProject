package com.zp.handmade.springframework.beans.factory.support;

import com.zp.handmade.springframework.BeansException;
import com.zp.handmade.springframework.beans.BeanFactory;
import com.zp.handmade.springframework.beans.factory.config.BeanDefinition;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 22:09
 * Version : v1.0.0
 * Description: 抽象类定义模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);


    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
