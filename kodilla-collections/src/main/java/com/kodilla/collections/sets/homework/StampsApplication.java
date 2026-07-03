package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Poland", "3x3", true));
        stamps.add(new Stamp("Japan", "4x4", false));
        stamps.add(new Stamp("Poland", "3x3", true));
        stamps.add(new Stamp("Japan", "4x4", true));
        stamps.add(new Stamp("Spain", "4x3", false));
        stamps.add(new Stamp("Brazil", "2x3", false));
        stamps.add(new Stamp("Spain", "4x3", false));
        stamps.add(new Stamp("China", "3x3", false));
        stamps.add(new Stamp("Uruguay", "4x2", true));
        stamps.add(new Stamp("Uruguay", "4x2", true));
        stamps.add(new Stamp("Argentina", "3x3", false));
        stamps.add(new Stamp("Argentina", "3x3", false));
        stamps.add(new Stamp("Argentina", "4x4", false));
        stamps.add(new Stamp("Brazil", "2x3", false));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}