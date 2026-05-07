package com.zp.handmade.springframework.beans;

/**
 * @author : zhengpanone
 * Date : 2026/5/7 22:12
 * Version : v1.0.0
 * Description:
 */
public class BeansException extends RuntimeException{

    private final String msg;

    public BeansException(String msg) {
        this.msg = msg;
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }
}
