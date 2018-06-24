package com.infoshare.refactoring._1_smells._2_primitives.simple;

public class SimplePrimitivesExample {

    public static void main(String[] args) {

        printReport("Gdańsk", 464254);
        printReport("Gdynia", 246306);
        printReport("Ankamaty", 16);

        // TODO: Pokazać przykład, że można się pomylić i przesłać tutaj na przykład imię i wiem
        // TODO: Pokazać o ile łatwiej rozbudować funkcjonalność gdy są obiekty (dodać do City powierzchnie / ilość kin)
    }

    private static void printReport(String city, long population) {
        System.out.println("Population of city " + city + " is " + population);
    }
}
