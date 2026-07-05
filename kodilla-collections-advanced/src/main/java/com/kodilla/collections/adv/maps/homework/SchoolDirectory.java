package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> studentsInClasses = new HashMap<>();
        Principal john = new Principal("John", "Pork");
        Principal hank = new Principal("Hank", "Hamburger");
        Principal bob = new Principal("Bob", "Bacon");
        Principal susan = new Principal("Susan", "Sausage");

        School johnSchool = new School("Raw Pork School", Arrays.asList(30, 17, 21, 33, 29, 18, 24, 19));
        School hankSchool = new School("Smash Hamburger School", Arrays.asList(31, 23, 21, 30, 17, 24, 29, 28));
        School bobSchool = new School("Tasty Bacon School", Arrays.asList(17, 18, 20, 24, 31, 28, 33, 30));
        School susanSchool = new School("Country Sausage School", Arrays.asList(28, 22, 16, 21, 26, 23, 24, 33));

        studentsInClasses.put(john, johnSchool);
        studentsInClasses.put(hank, hankSchool);
        studentsInClasses.put(bob, bobSchool);
        studentsInClasses.put(susan, susanSchool);

        for (Map.Entry<Principal, School> principalSchoolEntry : studentsInClasses.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getFullName() + ", dyrektor placowki: " +
            principalSchoolEntry.getValue().getSchoolName() + ", laczna liczba studentow: " +
            principalSchoolEntry.getValue().getTotalNumberOfStudents() + ".");
        }
    }
}