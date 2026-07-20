package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("120"));
        warehouse.addOrder(new Order("240"));
        warehouse.addOrder(new Order("360"));
        warehouse.addOrder(new Order("480"));
        warehouse.addOrder(new Order("600"));

        try {
            warehouse.getOrder("999");
        } catch (OrderDoesntExistException e) {
            System.out.println("Niestety, takie zamowienie nie istnieje w naszym systemie.");
        }
    }
}