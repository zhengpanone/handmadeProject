package com.zp.handmade.springframework.beans.factory.config;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 22:04
 * Version : v1.0.0
 * Description: 单例注册接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
