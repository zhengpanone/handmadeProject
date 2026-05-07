package com.zp.handmade.springframework.beans.factory.config;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 21:50
 * Version : v1.0.0
 * Description: 定义 Bean 实例化信息
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
