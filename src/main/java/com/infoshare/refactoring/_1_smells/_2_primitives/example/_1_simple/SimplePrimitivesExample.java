package com.infoshare.refactoring._1_smells._2_primitives.example._1_simple;

public class SimplePrimitivesExample {

    public static void main(String[] args) {
        printReport("Gdańsk", 464254);
        printReport("Gdynia", 246306);
        printReport("Ankamaty", 16);
    }

    private static void printReport(String city, long population) {
        System.out.println("Population of city " + city + " is " + population);
    }
}
