package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw", "Tokyo"));
        flightsTable.add(new Flight("Barcelona", "Oslo"));
        flightsTable.add(new Flight("Warsaw", "Beijing"));
        flightsTable.add(new Flight("Madrid", "Barcelona"));
        flightsTable.add(new Flight("Warsaw", "Sydney"));
        flightsTable.add(new Flight("Sapporo", "Tokyo"));
        flightsTable.add(new Flight("Seoul", "Bilbao"));
        flightsTable.add(new Flight("Berlin", "Paris"));
        flightsTable.add(new Flight("Paris", "Tokyo"));
        return flightsTable;
    }
}