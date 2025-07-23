package com.zp.handmade.springframework;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 21:50
 * Version : v1.0.0
 * Description: 定义 Bean 实例化信息
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
