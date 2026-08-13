package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentClocksWithDifferentTimes() throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Clock firstBean = context.getBean(Clock.class);
        // Używam Thread.sleep, aby wymusić różnicę czasu między utworzeniem beanów.
        // Wyczytałem że jest to uznawane raczej za złą praktykę w profesjonalnym programowaniu.
        // Jeśli jest jakiś inny sposób na wykonanie tego, z chęcią go poznam i przerobię zadanie. :)
        Thread.sleep(10);

        Clock secondBean = context.getBean(Clock.class);
        Thread.sleep(10);

        Clock thirdBean = context.getBean(Clock.class);

        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);

        Assertions.assertNotEquals(firstBean.getTime(), secondBean.getTime());
        Assertions.assertNotEquals(secondBean.getTime(), thirdBean.getTime());
        Assertions.assertNotEquals(firstBean.getTime(), thirdBean.getTime());
    }
}