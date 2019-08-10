package com.example.SpringIoCpractice;//TODO

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

    public static void main(String[] args) {

        ApplicationContext app=new ClassPathXmlApplicationContext("hello.xml");
        //获取Helloworld实例
       HelloWorld hw= (HelloWorld)app.getBean("hw");
       hw.setHello("Hello World！");
       hw.getHello();
    }

}