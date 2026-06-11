package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {

    public MacOs(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("System operacyjny MacOs zostal wlaczony.");
    }

    @Override
    public void turnOff() {
        System.out.println("System operacyjny MacOs zostal wylaczony.");
    }
}