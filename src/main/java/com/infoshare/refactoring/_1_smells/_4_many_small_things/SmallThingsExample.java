package com.infoshare.refactoring._1_smells._4_many_small_things;

import java.util.Arrays;

public class SmallThingsExample {

    public static void main(String[] args) {
        BasketPriceCalculator basketPriceCalculator = new BasketPriceCalculator();

        Item chair = new Item("Krzeslo", 60, false);
        Item desk = new Item("Stol", 60, false);
        Item knife = new Item("Lampa", 5, true);
        Item pot = new Item("Garnek", 10, false);
        Item wardrobe = new Item("Szafa", 120, false);

        Basket furnitureBasket = new Basket(Arrays.asList(wardrobe, desk, chair));
        Basket kitchenBasket = new Basket(Arrays.asList(knife, pot, knife, pot, pot, knife));
        Basket smallBasket = new Basket(Arrays.asList(chair, desk));

        System.out.println("Total price: " + basketPriceCalculator.calculateTotalPrice(furnitureBasket));
        System.out.println("Total price: " + basketPriceCalculator.calculateTotalPrice(kitchenBasket));
        System.out.println("Total price: " + basketPriceCalculator.calculateTotalPrice(smallBasket));
    }
}
