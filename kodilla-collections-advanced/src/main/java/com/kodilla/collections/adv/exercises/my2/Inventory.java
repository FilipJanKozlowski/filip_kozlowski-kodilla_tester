package com.kodilla.collections.adv.exercises.my2;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> findItemsByRarity(String rarity) {
        List<Item> resultList = new ArrayList<>();

        for (Item item : items) {
            if (item.getRarity().equals(rarity)) {
                resultList.add(item);
            }
        }
        return resultList;
    }
}
