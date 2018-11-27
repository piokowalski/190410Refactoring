package com.infoshare.refactoring._3_exercise.data;


import com.infoshare.refactoring._3_exercise.ConsoleReader;

import java.math.BigDecimal;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class NewTransactionCreator {

    private Transaction newTransaction = new Transaction();
    private final Data data;
    private final ConsoleReader consoleReader;

    public NewTransactionCreator(Data data, ConsoleReader consoleReader) {
        this.data = data;
        this.consoleReader = consoleReader;
    }

    public Transaction loadNewTransaction() {
        newTransaction.setCity(loadCity(data.cityList(data.getTransactionsBase())));
        newTransaction.setDistrict(loadDistrict(data.districtList(data.getTransactionsBase(), newTransaction)));
        newTransaction.setStreet(loadStreet());
        newTransaction.setTypeOfMarket(loadMarket());
        newTransaction.setPrice(BigDecimal.valueOf(0));

        System.out.println(newTransaction);         // Wypisanie podanych przez urzytkownika danych w formie transakcji
        return newTransaction;
    }

    private String loadDistrict(List<String> districtList) {
        int printLimit;
        System.out.println("Podaj w jakiej dzielnicy jest twoje mieszkanie");
        char[] charsArray = consoleReader.readString().toCharArray();                      // urzytkownik wpisuje dzielnice jako string i zamieniany jest na charArray
        Map<String, Integer> districtMap = new HashMap<>();
        compare(districtList, charsArray, districtMap);
        Map<String, Integer> sortedMap = sorter(districtMap);                     // sortowanie mapy wzgledem value od najwiekszego do najmniejszego
        List<String> sortedDistrictList = new ArrayList<>(sortedMap.keySet());

        if (sortedDistrictList.size() < 5) {
            printLimit = sortedDistrictList.size();
        } else {
            printLimit = 5;
        }
        for (int i = 0; i < printLimit; i++) {
            System.out.println(i + 1 + " - " + sortedDistrictList.get(i));                  // wypisanie na ekran 5 dzielnic z najwiekszym counterem
        }
        return sortedDistrictList.get(consoleReader.readInt(1, printLimit) - 1);
    }

    public String loadCity(List<String> cityList) {
        int printLimit;
        System.out.println("Podaj nazwę miasta, w którym mieszkasz");
        char[] charsArray = consoleReader.readString().toCharArray();
        Map<String, Integer> cityMap = new HashMap<>();
        compare(cityList, charsArray, cityMap);
        Map<String, Integer> sortedMap = sorter(cityMap);
        List<String> sortedCityList = new ArrayList<>(sortedMap.keySet());
        if (sortedCityList.size() < 5) {
            printLimit = sortedCityList.size();
        } else {
            printLimit = 5;
        }

        for (int i = 0; i < printLimit; i++) {
            System.out.println(i + 1 + " - " + sortedCityList.get(i));
        }
        return sortedCityList.get(consoleReader.readInt(1, printLimit) - 1);
    }

    private void compare(List<String> districtList, char[] charsArray, Map<String, Integer> districtMap) {
        for (int i = 0; i < districtList.size(); i++) {
            Integer counter = 0;
            for (int j = 0; j < charsArray.length; j++) {
                if (districtList.get(i).indexOf(charsArray[j]) != -1) {
                    counter++;                                                 // pętla porównuje ile z podanych liter znajdire się w nazwie dzielnic
                }
                districtMap.put(districtList.get(i), counter);                  // tworzona jest mapa - dzielnica jako key, counter jako value
            }
        }
    }

    private String loadStreet() {
        System.out.println("Podaj nazwę ulicy");
        return consoleReader.readString();
    }

    private String loadMarket() {
        System.out.println("Podaj rodzaj rynku" + "\n" + "1 - Rynek wtórny" + "\n" + "2 - Rynek pierwotny");
        String[] marketList = {"RYNEK WTÓRNY", "RYNEK PIERWOTNY"};
        return marketList[consoleReader.readInt(1, 2) - 1];
    }

    public Transaction getNewTransaction() {
        return newTransaction;
    }

    public void setNewTransaction(Transaction newTransaction) {
        this.newTransaction = newTransaction;
    }


    public Map sorter(Map<String, Integer> givenMap) {

        Map<String, Integer> sorted = givenMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        return sorted;
    }
}
