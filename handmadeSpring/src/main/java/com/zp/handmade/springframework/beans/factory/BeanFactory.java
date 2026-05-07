package com.zp.handmade.springframework.beans.factory;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 21:50
 * Version : v1.0.0
 * Description: Bean工厂
 * 包括了Bean的注册和获取
 */
public interface BeanFactory {


    Object getBean(String name);

}
