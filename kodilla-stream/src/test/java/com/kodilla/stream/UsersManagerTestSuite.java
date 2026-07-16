package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTestSuite {

    @Test
    public void testFilterChemistsGroupUsername() {
        List<String> expectedGroup = new ArrayList<>();
        expectedGroup.add("Walter White");
        expectedGroup.add("Gale Boetticher");

        List<String> result = UsersManager.filterChemistGroupUsernames();

        assertEquals(expectedGroup, result);
    }

    @Test
    public void testFilterUsersOlderThan() {
        int age = 40;

        List<User> result = UsersManager.filterUsersOlderThan(age);

        assertEquals(4, result.size());
        for (User user : result) {
            assertTrue(user.getAge() > age);
        }
    }

    @Test
    public void testSearchEmptyAccounts() {

        List<User> result = UsersManager.searchEmptyAccounts();

        assertEquals(2, result.size());
        for (User user : result) {
            assertTrue(user.getNumberOfPost() == 0);
        }
    }
}