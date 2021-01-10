package com.springframework.didemo;

import com.springframework.didemo.controller.ConstructorInjectionController;
import com.springframework.didemo.controller.MyController;
import com.springframework.didemo.controller.PropertyInjectionController;
import com.springframework.didemo.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        myController.printHello();

        System.out.println(context.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(context.getBean(SetterInjectionController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectionController.class).sayHello());
    }
}
