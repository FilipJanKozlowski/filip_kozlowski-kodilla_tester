package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("System operacyjny z roku " + year + " zostal wlaczony.");
    }

    public void turnOff() {
        System.out.println("System operacyjny z roku " + year + " zostal wylaczony.");
    }
}