package com.infoshare.refactoring._1_smells._5_nulls.example;

public class Doctor {

    private final String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
