package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTestSuite {

    @Test
    public void testOptionalWithTeacher() {
        Student student = new Student("Test Uczen", new Teacher("Test Nauczyciel"));

        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher.map(Teacher::getName).orElse("<undefined>");

        assertEquals("Test Nauczyciel", teacherName);
    }

    @Test
    public void testOptionalWithoutTeacher() {
        Student student = new Student("Test Uczen", null);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacherName = optionalTeacher.map(Teacher::getName).orElse("<undefined>");

        assertEquals("<undefined>", teacherName);
    }
}