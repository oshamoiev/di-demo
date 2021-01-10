package com.springframework.didemo.controller;

import com.springframework.didemo.service.HelloService;
import com.springframework.didemo.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
    public HelloServiceImpl helloService;

    public String sayHello() {
        return helloService.sayHello();
    }
}
