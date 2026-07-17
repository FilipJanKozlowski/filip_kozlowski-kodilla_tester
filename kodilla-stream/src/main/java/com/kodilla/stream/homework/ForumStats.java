package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double avgPostsForUsersAtLeast40(List<User> users) {
        double result1 = users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average().orElse(0.0);
        return result1;
    }

    public static double avgPostsForUsersBelow40(List<User> users) {
        double result2 = users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average().orElse(0.0);
        return result2;
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        System.out.println("Srednia liczba postow dla uzytkownikow posiadajacych co najmniej 40 lat: " + avgPostsForUsersAtLeast40(users));
        System.out.println("Srednia liczba postow dla uzytkownikow posiadajacych ponizej 40 lat: " + avgPostsForUsersBelow40(users));
    }
}