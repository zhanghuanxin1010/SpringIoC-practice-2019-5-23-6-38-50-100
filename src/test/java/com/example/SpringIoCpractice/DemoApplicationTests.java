package com.example.SpringIoCpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private HelloWorld hw;
    @Test
    public void contextLoads() {
        hw.setHello("helloworld");
        hw.getHello();
    }

}
