package com.kodilla.collections.interfaces;

public class Circle implements Shape {
    private double radius;
    static final double PI = 3.1415927;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
