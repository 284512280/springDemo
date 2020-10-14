package com.example.demo.even;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * springboot启动监听类
 */
public class MyApplicationStartingEventListener implements ApplicationListener {



    private int flag =1;
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        System.out.println(flag + " execute "+applicationEvent.getClass()+"----------");
        flag++;
    }
}