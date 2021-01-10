package com.springframework.didemo.controller;

import com.springframework.didemo.service.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final HelloService helloService;

    public ConstructorInjectionController(@Qualifier("constructorHelloService") HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.sayHello();
    }
}
