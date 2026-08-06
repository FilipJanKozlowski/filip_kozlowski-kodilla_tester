package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTestSuite {

    @Test
    public void shouldAddOrderToShop() {

        Shop shop = new Shop();
        Order order = new Order(150.50, LocalDate.of(2023, 10, 1), "user123");

        shop.addOrder(order);

        assertEquals(1, shop.getOrderCount());
    }

    @Test
    public void shouldNotAddDuplicateOrder() {

        Shop shop = new Shop();
        Order order1 = new Order(150.50, LocalDate.of(2023, 10, 1), "user123");
        Order order2 = new Order(150.50, LocalDate.of(2023, 10, 1), "user123");

        shop.addOrder(order1);
        shop.addOrder(order2);

        assertEquals(1, shop.getOrderCount());
    }

    @Test
    public void shouldReturnOrdersBetweenDates() {

        Shop shop = new Shop();
        shop.addOrder(new Order(100, LocalDate.of(2023, 5, 1), "user1"));
        shop.addOrder(new Order(200, LocalDate.of(2023, 5, 15), "user2"));
        shop.addOrder(new Order(300, LocalDate.of(2023, 5, 30), "user3"));

        List<Order> result = shop.getOrdersBetweenDates(LocalDate.of(2023, 5, 10), LocalDate.of(2023, 5, 20));

        assertEquals(1, result.size());
        assertEquals(200, result.get(0).getValue());
    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersInDateRange() {

        Shop shop = new Shop();
        shop.addOrder(new Order(100, LocalDate.of(2023, 1, 1), "user1"));

        List<Order> result = shop.getOrdersBetweenDates(LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 31));

        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnOrdersInValueRange() {

        Shop shop = new Shop();
        shop.addOrder(new Order(50, LocalDate.now(), "user1"));
        shop.addOrder(new Order(100, LocalDate.now(), "user2"));
        shop.addOrder(new Order(150, LocalDate.now(), "user3"));

        List<Order> result = shop.getOrdersInValueRange(80, 120);

        assertEquals(1, result.size());
        assertEquals(100, result.get(0).getValue());
    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersInValueRange() {

        Shop shop = new Shop();
        shop.addOrder(new Order(50, LocalDate.now(), "user1"));

        List<Order> result = shop.getOrdersInValueRange(1000, 2000);

        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnZeroForEmptyShop() {

        Shop shop = new Shop();

        int count = shop.getOrderCount();

        assertEquals(0, count);
    }

    @Test
    public void shouldReturnCorrectNumberOfOrders() {

        Shop shop = new Shop();
        shop.addOrder(new Order(10, LocalDate.now(), "user1"));
        shop.addOrder(new Order(20, LocalDate.now(), "user2"));

        int count = shop.getOrderCount();

        assertEquals(2, count);
    }

    @Test
    public void shouldReturnZeroSumForEmptyShop() {

        Shop shop = new Shop();

        double total = shop.getTotalValue();

        assertEquals(0.0, total);
    }

    @Test
    public void shouldCalculateTotalValueOfAllOrders() {

        Shop shop = new Shop();
        shop.addOrder(new Order(50.50, LocalDate.now(), "user1"));
        shop.addOrder(new Order(20.00, LocalDate.now(), "user2"));

        double total = shop.getTotalValue();

        assertEquals(70.50, total);
    }
}