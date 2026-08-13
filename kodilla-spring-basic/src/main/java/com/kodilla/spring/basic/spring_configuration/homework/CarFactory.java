package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarFactory {

    // Nie jestem pewny czy w zadaniu chodziło o ściągnięcie aktualnego czasu (następne zadanie dotyczy dokładnie tego)
    // czy wpisaniu czasu "na sztywno".
    // Wybrałem tą drugą opcję, ale mogę również stworzyć drugą wersję która będzie ściągała aktualny czas. :)

    @Bean
    public Car chooseCar() {
        String currentSeason = "SUMMER";
        Car car;

        if (currentSeason.equals("SUMMER")) {
            car = new Cabrio();
        } else if (currentSeason.equals("WINTER")) {
            car = new SUV();
        } else {
            car = new Sedan();
        }

        return car;
    }
}