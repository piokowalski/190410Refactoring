package com.infoshare.refactoring._2_exercise;

import java.util.*;

public class ItemService {

    public static List<History> histories = new ArrayList<>();

    public static Map<String, Integer> prices = new HashMap<>();
    public static Map<String, Boolean> isAvailable = new HashMap<>();
    public static Map<String, String> descriptions = new HashMap<>();

    public void addItemToStock(String n, Integer p, String d, Boolean a) {
        prices.put(n, p);
        descriptions.put(n, d);
        isAvailable.put(n, a);
    }

    public void showStockReport() {
        Set<String> strings = prices.keySet();
        for (String item : strings) {
            System.out.println("Name: " + item);
            System.out.println("Description: " + descriptions.get(item));
            System.out.println("Price: " + prices.get(item));
            System.out.println("Is available: " + isAvailable.get(item));
        }
    }

    public void buyItem(String item, boolean showTotalSummary) {
        Boolean cnt = isAvailable.get(item);
        if (cnt == null || cnt == false) {
            return;
        }

        History history = new History();
        history.item = item;
        history.price = prices.get(item);
        history.description = descriptions.get(item);
        histories.add(history);

        int total = 0;
//                        for (int i = 0; i < hstItems.size(); i++) {
//                            String it = hstItems.get(i);
//                            Integer pr = prices.get(it);
//                            total += pr;
//                        }

        // calculate total items price
        for (int i = 0; i < histories.size(); i++) {
            History hs = histories.get(i);
            Integer pr = hs.price;
            total += pr;
        }

        if (showTotalSummary) {
            List<History> usrhist = histories;

            if (usrhist.size() == 0) {
                System.out.println("You bought nothing yet");
            } else {
                System.out.println("You bought:");
                int t = 0;
                // calculate total items price
                for (int i = 0; i < usrhist.size(); i++) {
                    System.out.println(usrhist.get(i).item + " - " + usrhist.get(i).price);
                    t = t + usrhist.get(i).price;
                }
                System.out.println("You spent: " + t);
            }
        } else {
            System.out.println("You bought totally " + histories.size() + " items for " + total + ".");
        }
    }
}
