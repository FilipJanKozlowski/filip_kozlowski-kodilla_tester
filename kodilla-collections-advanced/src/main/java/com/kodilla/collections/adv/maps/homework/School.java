package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsInClasses = new ArrayList<>();

    public School(String schoolName, List<Integer> school) {
        this.schoolName = schoolName;
        this.studentsInClasses = school;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getTotalNumberOfStudents() {
        int sum = 0;
        for (int students : studentsInClasses)
            sum += students;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + studentsInClasses +
                '}';
    }
}