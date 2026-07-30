package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void shouldThrowExceptionForInvalidNumbers(String numbersString) {

        Set<Integer> invalidNumbers = Arrays.stream(numbersString.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(invalidNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv")
    public void shouldCalculateWinsForValidNumbers(String numbersString) throws InvalidNumbersException {

        Set<Integer> validNumbers = Arrays.stream(numbersString.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        int result = machine.howManyWins(validNumbers);

        assertTrue(result >= 0 && result <= 6);
    }
}