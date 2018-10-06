package com.infoshare.refactoring._1_smells._4_many_small_things;

import java.util.List;

public class BasketPriceCalculator {

    public double calculateTotalPrice(Basket basket) {
        int foo = sum(basket.items);

        double discounted = foo;
        if (foo > 200 || basket.items.size() > 5) {
            discounted = foo * 0.8;
        }

        return discounted;
    }

    private int sum(List<Item> items) {
        int s = 0;

        for (Item i: items) {
            if (!i.isForFree) {
                s += i.price;
            }
        }

        return s;
    }
}
