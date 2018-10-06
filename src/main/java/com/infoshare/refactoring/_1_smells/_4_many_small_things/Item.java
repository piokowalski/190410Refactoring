package com.infoshare.refactoring._1_smells._4_many_small_things;

public class Item {

    public int price;
    public String name;
    public boolean isForFree;

    public Item(String name, int price, boolean isForFree) {
        this.name = name;
        this.price = price;
        this.isForFree = isForFree;
    }
}
