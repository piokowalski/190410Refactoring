package com.infoshare.refactoring._2_exercise;

import java.util.*;

public class ItemService {

    public static final String NEW_LINE = System.lineSeparator();

    public List<History> histories = new ArrayList<>();

    public Map<String, Integer> prices = new HashMap<>();
    public Map<String, Boolean> isAvailable = new HashMap<>();
    public Map<String, String> descriptions = new HashMap<>();

    public void addItemToStock(String n, Integer p, String d, Boolean a) {
        prices.put(n, p);
        descriptions.put(n, d);
        isAvailable.put(n, a);
    }

    public String getStockReport() {
        Set<String> strings = prices.keySet();
        StringBuilder builder = new StringBuilder();
        for (String item : strings) {
            builder.append("Name: " + item + NEW_LINE);
            builder.append("Description: " + descriptions.get(item)+ NEW_LINE);
            builder.append("Price: " + prices.get(item)+ NEW_LINE);
            builder.append("Is available: " + isAvailable.get(item)+ NEW_LINE);
            builder.append(NEW_LINE);
        }

        return builder.toString();
    }

    public String buyItem(String item, boolean showTotalSummary) {
        Boolean cnt = isAvailable.get(item);
        if (cnt == null || cnt == false) {
            return "";
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
                return "You bought nothing yet";
            } else {
                StringBuilder builder = new StringBuilder();
                builder.append("You bought:").append(NEW_LINE);
                int t = 0;
                // calculate total items price
                for (int i = 0; i < usrhist.size(); i++) {
                    builder.append(usrhist.get(i).item).append(" - ").append(usrhist.get(i).price).append(NEW_LINE);
                    t = t + usrhist.get(i).price;
                }
                return builder.append("You spent: ").append(t).toString();
            }
        } else {
            return "You bought totally " + histories.size() + " items for " + total + ".";
        }
    }
}
