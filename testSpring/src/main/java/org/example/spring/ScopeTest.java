package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog=context.getBean("dog", Dog.class);
//        Dog yourDog=context.getBean("dog", Dog.class);
//        System.out.println("this objects are equals="+(myDog==yourDog));
        myDog.say();

    }
}
