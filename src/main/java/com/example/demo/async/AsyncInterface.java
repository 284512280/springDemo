package com.example.demo.async;

import org.springframework.scheduling.annotation.Async;

public interface AsyncInterface {
    @Async
    void testAsync();
}
