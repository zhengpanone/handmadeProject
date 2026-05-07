package com.zp.handmade.springframework.test;

import com.zp.handmade.springframework.beans.factory.config.BeanDefinition;
import com.zp.handmade.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zp.handmade.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 21:51
 * Version : v1.0.0
 * Description:
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. 注册 Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3. 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4. 第二次获取 Bean
        UserService userService1 = (UserService) beanFactory.getBean("userService");
        userService1.queryUserInfo();
    }
}
