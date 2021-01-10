package com.springframework.didemo.controller;

import com.springframework.didemo.service.HelloService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final HelloService helloService;

    public ConstructorInjectionController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.sayHello();
    }
}
