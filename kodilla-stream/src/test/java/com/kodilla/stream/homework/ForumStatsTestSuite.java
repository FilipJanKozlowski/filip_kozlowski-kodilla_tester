package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.homework.ForumStats.avgPostsForUsersAtLeast40;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuite {

    @Test
    public void testDefaultAverageCalculation() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("User1", 50, 10, "Group1"));
        testUsers.add(new User("User2", 45, 20, "Group1"));
        testUsers.add(new User("User3", 20, 100, "Group1"));
        testUsers.add(new User("User4", 30, 200, "Group1"));

        double avgForOlder = ForumStats.avgPostsForUsersAtLeast40(testUsers);
        double avgForYounger = ForumStats.avgPostsForUsersBelow40(testUsers);

        assertEquals(15.0, avgForOlder, 0.0001);
        assertEquals(150.0, avgForYounger, 0.0001);
    }

    @Test
    public void testAverageCalculationForEmptyList() {
        List<User> emptyList = new ArrayList<>();

        double result1 = ForumStats.avgPostsForUsersAtLeast40(emptyList);
        double result2 = ForumStats.avgPostsForUsersBelow40(emptyList);

        assertEquals(0.0, result1);
        assertEquals(0.0, result2);
    }

    @Test
    public void testAverageCalculationForOneAgeGroup() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("User1", 20, 30, "Group1"));
        testUsers.add(new User("User2", 30, 60, "Group1"));

        double avgForYounger = ForumStats.avgPostsForUsersBelow40(testUsers);
        double avgForOlder = ForumStats.avgPostsForUsersAtLeast40(testUsers);

        assertEquals(45.0, avgForYounger, 0.0001);
        assertEquals(0.0, avgForOlder, 0.0001);
    }
}