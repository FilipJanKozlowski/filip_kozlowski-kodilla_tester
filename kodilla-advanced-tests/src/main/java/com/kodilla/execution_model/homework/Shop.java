package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(LocalDate start, LocalDate end) {
        return orders.stream()
                .filter(order -> !order.getDate().isBefore(start) && !order.getDate().isAfter(end))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersInValueRange(double min, double max) {
        return orders.stream()
                .filter(order -> order.getValue() >= min && order.getValue() <= max)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}