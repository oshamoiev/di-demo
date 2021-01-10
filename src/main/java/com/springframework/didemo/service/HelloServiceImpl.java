package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    public static final String HELLO = "hello";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
