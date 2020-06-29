package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String test(){
        System.out.println("11111");
        return "index.html";
    }
}
