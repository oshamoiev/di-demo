package com.springframework.didemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String printHello() {
        System.out.println("Hello!");
        return "foo";
    }
}
