package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldReturnCorrectCarBasedOnSeason() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");

        String carType = car.getCarType();
        System.out.println("Zwrocony samochod to: " + carType);

        List<String> possibleCars = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCars.contains(carType));
    }

    @Test
    public void shouldReturnCorrectHeadlightsState() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");

        boolean areHeadlightsOn = car.hasHeadlightsTurnedOn();

        Assertions.assertTrue(areHeadlightsOn);
    }
}