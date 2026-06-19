package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        // --- TESTOWANIE FIGUR ---
        Shape square = new Square(5.0);
        System.out.println("Pole kwadratu: " + square.getSurfaceArea());
        System.out.println("Obwod kwadratu: " + square.getPerimeter());

        Shape circle = new Circle(3.0);
        System.out.println("Pole kola: " + circle.getSurfaceArea());

        System.out.println("-------------------------");

        Job manualTester = new ManualTester();
        Job automationTester = new AutomationTester();

        Person user1 = new Person("Tomasz", 23, manualTester);
        Person user2 = new Person("Karol", 28, automationTester);

        user1.showResponsibilities();
        user2.showResponsibilities();
    }
}