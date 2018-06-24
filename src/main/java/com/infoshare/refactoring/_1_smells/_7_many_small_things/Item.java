package com.infoshare.refactoring._1_smells._7_many_small_things;

public class Item {

    public int price;
    public String name;
    public boolean isForFree;

    private Item(String name, int price, boolean isForFree) {
        this.name = name;
        this.price = price;
        this.isForFree = isForFree;
    }

    public static Item createItem(String name, int price) {
        return new Item(name, price, false);
    }

    public static Item createFreeItem(String name, int price) {
        return new Item(name, price, true);
    }
}
