package com.example.demo;

import com.example.demo.async.AsyncInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
    @Autowired
    AsyncInterface anInterface;

    @RequestMapping("/index")
    public String test(){
        System.out.println("11111");
        anInterface.testAsync();
        System.out.println("222222");
        return "index.html";
    }
}
