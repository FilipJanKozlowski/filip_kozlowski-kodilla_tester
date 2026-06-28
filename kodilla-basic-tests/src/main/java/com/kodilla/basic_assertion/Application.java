package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie dziala poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubstract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubstract) {
            System.out.println("Metoda substract dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie dziala poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);
        if (correctSquare) {
            System.out.println("Metoda square dziala poprawnie dla liczb " + a + " i " + a);
        } else {
            System.out.println("Metoda square nie dziala poprawnie dla liczb " + a + " i " + a);
        }
    }
}