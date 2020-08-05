package com.example.demo.async;


import org.springframework.stereotype.Service;

@Service
public class TestAsync implements AsyncInterface {
    @Override
    public void testAsync() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
