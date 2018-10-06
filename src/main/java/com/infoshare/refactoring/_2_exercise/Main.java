package com.infoshare.refactoring._2_exercise;

public class Main {

    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        itemService.addItemToStock("Desk", 120, "Bureau piece of furniture", true);
        itemService.addItemToStock("Chair", 30, "A chair with arms is an armchair", true);
        itemService.addItemToStock("Wardrobe", 80, "Standing closet used for storing clothes", false);
        itemService.addItemToStock("Table", 500, "Item of with a flat top and one or more legs", true);

        System.out.println(itemService.getStockReport());

        System.out.println(itemService.buyItem("Chair", false));
        System.out.println(itemService.buyItem("Chair", false));
        System.out.println(itemService.buyItem("Table", false));
        System.out.println(itemService.buyItem("Wardrobe", false));
        System.out.println(itemService.buyItem("Desk", true));
    }
}