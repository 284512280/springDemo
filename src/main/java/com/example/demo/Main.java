package com.example.demo;

import com.example.demo.even.MyApplicationStartingEventListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyApplicationStartingEventListener.class);
    }
}
