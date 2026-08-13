package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        int currentHour = 22;
        return currentHour >= 20 || currentHour < 6;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}