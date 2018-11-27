package com.infoshare.refactoring._3_exercise.data;

//Klasa zawierajaca dane wczytywane z pliku, kazdy rekord w pliku excel bedzie jedna iinstancja clasy transaction.
// klasa data powinna zawierac metody pozwalajace dodawac rekord do bazy(pliku?)

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Data {

    private static List<Transaction> transactionsBase = new ArrayList<>();

    static {
        transactionsBase.add(new Transaction("Gdańsk", "Morena", "Piecewska", "RYNEK WTÓRNY", BigDecimal.valueOf(354678)));
        transactionsBase.add(new Transaction("Gdynia", "Witomino", "Małokacka", "RYNEK PIERWOTNY", BigDecimal.valueOf(274665)));
    }

    // Metoda do wyciągania z bazy danych listy miast/dzielnic bez duplikatów + w kolejnkości alfabetycznej
    // i przekazuje ja do wyswietlenia w menu
    public List<String> cityList(List<Transaction> transactionBase) {
        List<String> cityList = new ArrayList<>();
        for (int i = 0; i < transactionBase.size(); i++) {
            cityList.add(transactionBase.get(i).getCity());
        }
        Set<String> noDuplicates = new TreeSet<>(cityList);
        cityList = new ArrayList<>(noDuplicates);
        return cityList;
    }

    public List<String> districtList(List<Transaction> transactionsBase, Transaction newTransaction) {

        List<String> districtList = new ArrayList<>();
        for (int i = 0; i < transactionsBase.size(); i++) {
            if (newTransaction.getCity().equals(transactionsBase.get(i).getCity())) {
                districtList.add(transactionsBase.get(i).getDistrict());
            }
        }
        Set<String> noDuplicates = new TreeSet<>(districtList);
        districtList = new ArrayList<>(noDuplicates);
        return districtList;
    }

    public List<Transaction> getTransactionsBase() {
        return transactionsBase;
    }


    public ArrayList<Transaction> filterData() {
        //metoda wypluwajca przefiltrowana liste
        return null;
    }

    public void addTransactionToData(Transaction trans) {
        transactionsBase.add(trans);
    }
}

