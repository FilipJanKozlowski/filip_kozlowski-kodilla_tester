package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Ala", "adamus_67", "Kozl-owski.F"})
    public void shouldReturnTrueForValidUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"FK", "$ab|n@", "Filip to kozak 123"})
    public void shouldReturnFalseForInvalidUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"japaneseemail@ohayo.jp", "GuineaPigsLovers@pig.pl", "spainisanewworldcupwinner@taco.es"})
    public void shouldReturnTrueForValidEmail(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"thebestemailintheworld.pl", "themostjapaneseemail@ohayo.japanese", "IAMAutomationTester@javapl"})
    public void shouldReturnFalseForInvalidEmail(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }
}