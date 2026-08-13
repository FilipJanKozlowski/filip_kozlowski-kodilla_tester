package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldAddProperly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(5.0, 2.0);
        Assertions.assertEquals(7.0, result);
    }

    @Test
    public void shouldSubtractProperly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(5.0, 2.0);
        Assertions.assertEquals(3.0, result);
    }

    @Test
    public void shouldMultiplyProperly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(5.0, 2.0);
        Assertions.assertEquals(10.0, result);
    }

    @Test
    public void shouldDivideProperly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(5.0, 2.0);
        Assertions.assertEquals(2.5, result);
    }
}