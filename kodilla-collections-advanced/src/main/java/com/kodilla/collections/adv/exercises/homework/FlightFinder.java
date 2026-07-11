package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> allFlights = FlightRepository.getFlightsTable();
        List<Flight> resultList = new ArrayList<>();

        for (Flight flight : allFlights) {
            if (flight.getDeparture().equals(departure)) {
                resultList.add(flight);
            }
        }
        return resultList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> allFlights = FlightRepository.getFlightsTable();
        List<Flight> resultList = new ArrayList<>();

        for (Flight flight : allFlights) {
            if (flight.getArrival().equals(arrival)) {
                resultList.add(flight);
            }
        }
        return resultList;
    }
}