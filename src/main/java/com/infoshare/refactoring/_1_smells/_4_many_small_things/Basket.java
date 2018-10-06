package com.infoshare.refactoring._1_smells._4_many_small_things;

import java.util.List;

public class Basket {

    public List<Item> items;

    public Basket(List<Item> items) {
        this.items = items;
    }
}
