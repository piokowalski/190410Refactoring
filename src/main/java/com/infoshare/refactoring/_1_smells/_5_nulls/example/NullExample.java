package com.infoshare.refactoring._1_smells._5_nulls.example;

import java.time.LocalDate;
import java.time.Month;

public class NullExample {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Mikolaj");

        Patient maciekPatient = new Patient("Maciek");
        Patient anastazjaPatient = new Patient("Anastazja", doctor);

        System.out.println(getAssignedDoctorMessage(maciekPatient));
        System.out.println(getAssignedDoctorMessage(anastazjaPatient));

        Appointment maciekAppointment = new Appointment(LocalDate.of(2018, Month.OCTOBER, 6), maciekPatient);
        Appointment anastazjaAppointment = new Appointment(LocalDate.of(2018, Month.OCTOBER, 7), anastazjaPatient);

        System.out.println(getAppointmentMessage(anastazjaAppointment));
        System.out.println(getAppointmentMessage(maciekAppointment));
    }

    private static String getAssignedDoctorMessage(Patient patient) {
        if (patient.getDoctor() != null) {
            return String.format("Patient %s is assigned to %s", patient.getName(), patient.getDoctor().getName());
        } else {
            return String.format("Patient %s does not have a doctor", patient.getName());
        }
    }

    private static String getAppointmentMessage(Appointment appointment) {
        Patient patient = appointment.getPatient();
        Doctor doctor = patient.getDoctor();
        return String.format("Appointment for %s with doctor %s is scheduled on %s", patient.getName(), doctor.getName(), appointment.getDate());
    }
}
