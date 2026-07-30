package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BmiSources#provideDataForBmiTesting")
    public void shouldCalculateCorrectBmiCategory(double heightInMeters, double weightInKilogram, String expectedBmiCategory) {

        Person person = new Person(heightInMeters, weightInKilogram);

        String result = person.getBMI();

        assertEquals(expectedBmiCategory, result);
    }
}