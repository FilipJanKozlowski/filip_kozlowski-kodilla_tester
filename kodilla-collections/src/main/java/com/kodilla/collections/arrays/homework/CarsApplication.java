package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);
        if (drawnCarKind == 0) {
            Ford ford = new Ford();
            int numberOfIncreases = RANDOM.nextInt(5) + 1;
            for (int i = 0; i < numberOfIncreases; i++) {
                ford.increaseSpeed();
            }
            return ford;
        }

        else if (drawnCarKind == 1) {
            Opel opel = new Opel();
            int numberOfIncreases = RANDOM.nextInt(5) + 1;
            for (int i = 0; i < numberOfIncreases; i++) {
                opel.increaseSpeed();
            }
            return opel;
        }

        else {
            Kia kia = new Kia();
            int numberOfIncreases = RANDOM.nextInt(5) + 1;
            for (int i = 0; i < numberOfIncreases; i++) {
                kia.increaseSpeed();
            }
            return kia;
        }
    }

    public static void main(String[] args) {
        int size = RANDOM.nextInt(15) + 1;
        Car[] cars = new Car[size];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}