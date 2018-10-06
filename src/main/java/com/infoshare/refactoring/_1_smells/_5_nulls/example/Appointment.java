package com.infoshare.refactoring._1_smells._5_nulls.example;

import java.time.LocalDate;

public class Appointment {

    private final LocalDate date;
    private final Patient patient;

    public Appointment(LocalDate date, Patient patient) {
        this.date = date;
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }
}
