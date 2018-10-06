package com.infoshare.refactoring._1_smells._5_nulls.example;

public class Patient {

    private String name;
    private Doctor doctor;

    public Patient(String name) {
        this.name = name;
    }

    public Patient(String name, Doctor doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
