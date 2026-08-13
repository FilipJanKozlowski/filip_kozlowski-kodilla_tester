package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnSuccessMessageWhenWeightIsValid() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String message = bean.sendPackage("Minato-ku, Roppongi 6-10-1, Tokyo", 16.1);

        Assertions.assertEquals("Package delivered to: Minato-ku, Roppongi 6-10-1, Tokyo", message);
    }

    @Test
    public void shouldReturnFailMessageWhenWeightIsTooHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String message = bean.sendPackage("Minato-ku, Roppongi 6-10-1, Tokyo", 38.4);

        Assertions.assertEquals("Package not delivered to: Minato-ku, Roppongi 6-10-1, Tokyo", message);
    }
}