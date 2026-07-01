package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int speed;

    public Kia(int speed) {
        this.speed = speed;
    }

    public Kia() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 70;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 30;
    }
}