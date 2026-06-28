package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13.0, sumResult, 0.001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(-3.0, subtractResult, 0.001);
    }

    @Test
    public void testSquarePositive() {
        Calculator calculator = new Calculator();
        double a = 5.0;
        double squareResult = calculator.square(a);
        assertEquals(25.0, squareResult, 0.001);
    }

    @Test
    public void testSquareNegative() {
        Calculator calculator = new Calculator();
        double a = -5.0;
        double squareResult = calculator.square(a);
        assertEquals(25.0, squareResult, 0.001);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        double a = 0.0;
        double squareResult = calculator.square(a);
        assertEquals(0.0, squareResult, 0.001);
    }
}