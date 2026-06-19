package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square(5.0);
        System.out.println("Kwadrat - Pole: " + square.getSurfaceArea() + ", Obwod: " + square.getPerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Prostokat - Pole: " + rectangle.getSurfaceArea() + ", Obwod: " + rectangle.getPerimeter());

        Shape circle = new Circle(3.0);
        System.out.println("Kolo - Pole: " + circle.getSurfaceArea() + ", Obwod: " + circle.getPerimeter());

        System.out.println("-------------------------");

        Job manualTester = new ManualTester();
        Job automationTester = new AutomationTester();

        Person user1 = new Person("Tomasz", 23, manualTester);
        Person user2 = new Person("Karol", 28, automationTester);

        user1.showResponsibilities();
        user2.showResponsibilities();
    }
}