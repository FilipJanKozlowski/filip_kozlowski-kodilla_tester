package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testOrderDoesntExistExceptionIsThrown() {
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("999"));
    }
}