package com.kodilla.collections.interfaces.homework;

public class CarRace {
    private static void doRace(Car car) {
        car.increaseSpeed();
        System.out.println(car.getSpeed());
        car.increaseSpeed();
        System.out.println(car.getSpeed());
        car.increaseSpeed();
        System.out.println(car.getSpeed());
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

    public static void main(String[] args) {
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("START!!!");

        System.out.println("----------");

        System.out.println("Ford:");
        Ford ford = new Ford(0);
        doRace(ford);

        System.out.println("----------");

        System.out.println("Opel:");
        Opel opel = new Opel(0);
        doRace(opel);

        System.out.println("----------");

        System.out.println("Kia:");
        Kia kia = new Kia(0);
        doRace(kia);

        System.out.println("----------");

        System.out.println("KONIEC!!!");
        System.out.println("Zwyciezca... Kia!!!");
    }
}