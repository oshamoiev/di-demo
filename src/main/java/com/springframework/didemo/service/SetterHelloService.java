package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterHelloService implements HelloService {

    @Override
    public String sayHello() {
        return "Hello! I was injected via the setter.";
    }
}
