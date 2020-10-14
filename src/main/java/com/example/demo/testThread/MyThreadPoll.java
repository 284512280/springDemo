package com.example.demo.testThread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoll {

    public static ThreadPoolExecutor tp ;

    public static ThreadPoolExecutor getTp() {
        if(tp==null){
            ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                    .setNameFormat("demo-pool-%d").build();
            tp = new ThreadPoolExecutor(5,5,3000, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(10),namedThreadFactory,new ThreadPoolExecutor.AbortPolicy());
        }
        return tp;
    }
}


