package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Tokyo"));
        expectedList.add(new Flight("Warsaw", "Beijing"));
        expectedList.add(new Flight("Warsaw", "Sydney"));

        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Tokyo");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Tokyo"));
        expectedList.add(new Flight("Sapporo", "Tokyo"));
        expectedList.add(new Flight("Paris", "Tokyo"));

        assertEquals(expectedList, result);
    }
}