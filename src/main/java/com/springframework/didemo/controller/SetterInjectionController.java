package com.springframework.didemo.controller;

import com.springframework.didemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {
    private HelloService helloService;

    public String sayHello() {
        return helloService.sayHello();
    }

    @Autowired
    public void setHelloService(@Qualifier("setterHelloService")HelloService helloService) {
        this.helloService = helloService;
    }
}
