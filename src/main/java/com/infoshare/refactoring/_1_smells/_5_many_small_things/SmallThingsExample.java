package com.infoshare.refactoring._1_smells._5_many_small_things;

import java.util.Arrays;

public class SmallThingsExample {

    public static void main(String[] args) {
        BasketPriceCalculator basketPriceCalculator = new BasketPriceCalculator();

        Item chair = Item.createItem("Krzeslo", 60);
        Item desk = Item.createItem("Stol", 60);
        Item knife = Item.createFreeItem("Lampa", 5);
        Item pot = Item.createItem("Garnek", 10);
        Item wardrobe = Item.createItem("Szafa", 120);

        Basket furnitureBasket = new Basket(Arrays.asList(wardrobe, desk, chair));
        Basket kitchenBasket = new Basket(Arrays.asList(knife, pot, knife, pot, pot, knife));
        Basket smallBasket = new Basket(Arrays.asList(chair, desk));

        System.out.println("Total price: " + basketPriceCalculator.calculateTotalPrice(furnitureBasket));
        System.out.println("Total price: " + basketPriceCalculator.calculateTotalPrice(kitchenBasket));
        System.out.println("Total price: " + basketPriceCalculator.calculateTotalPrice(smallBasket));
    }
}
