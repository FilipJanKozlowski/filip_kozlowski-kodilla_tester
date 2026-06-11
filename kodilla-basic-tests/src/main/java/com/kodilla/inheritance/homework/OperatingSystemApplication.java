package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {

        Windows windows = new Windows(2023);
            windows.turnOn();
            windows.turnOff();

        MacOs macos = new MacOs(2026);
            macos.turnOn();
            macos.turnOff();
    }
}