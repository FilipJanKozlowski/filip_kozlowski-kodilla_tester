package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        if (car instanceof Ford) {
            System.out.println("Ford, predkosc: " + car.getSpeed());
        }
        else if (car instanceof Opel) {
            System.out.println("Opel, predkosc: " + car.getSpeed());
        }
        else if (car instanceof Kia) {
            System.out.println("Kia, predkosc: " + car.getSpeed());
        }
    }
}