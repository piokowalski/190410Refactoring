package com.infoshare.refactoring._1_smells._4_nulls;

public class Doctor {

    private final String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
