package com.kodilla.collections.adv.exercises.my2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTestSuite {

    @Test
    public void testFindItemsByRarity() {
        Inventory inventory = new Inventory();
        Item item1 = new Item("Sword", "Common");
        Item item2 = new Item("Shield", "Uncommon");
        Item item3 = new Item("Sword", "Rare");
        Item item4 = new Item("Helmet", "Legendary");
        Item item5 = new Item("Axe", "Rare");
        Item item6 = new Item("Staff", "Rare");
        Item item7 = new Item("Axe", "Uncommon");
        Item item8 = new Item("Helmet", "Legendary");
        Item item9 = new Item("Staff", "Common");
        Item item10 = new Item("Shield", "Rare");

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);
        inventory.addItem(item4);
        inventory.addItem(item5);
        inventory.addItem(item6);
        inventory.addItem(item7);
        inventory.addItem(item8);
        inventory.addItem(item9);
        inventory.addItem(item10);

        List<Item> result = inventory.findItemsByRarity("Rare");

        List<Item> expectedList = new ArrayList<>();
        expectedList.add(item3);
        expectedList.add(item5);
        expectedList.add(item6);
        expectedList.add(item10);

        assertEquals(expectedList, result);
    }
}
