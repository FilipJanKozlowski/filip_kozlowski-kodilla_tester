package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Suzan Suzuki", new Teacher("Adam Oak")));
        students.add(new Student("Fred Ford", new Teacher("Claire Chestnut")));
        students.add(new Student("Victor Volkswagen", new Teacher("Brandon Birch")));
        students.add(new Student("Francesca Ferrari", new Teacher("Bob Baobab")));
        students.add(new Student("Adi Audi", null));
        students.add(new Student("McKenzie McLaren", null));
        students.add(new Student("Judi Jeep", null));
        students.add(new Student("Nicholas Nissan", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.map(Teacher::getName).orElse("<undefined>");
            System.out.println("Uczen: " + student.getName() + ", Nauczyciel: " + teacherName);
        }
    }
}