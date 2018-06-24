package com.infoshare.refactoring._1_smells._3_nulls;

public class NullExample {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Mikolaj");

        Patient maciekPatient = new Patient("Maciek");
        Patient anastazjaPatient = new Patient("Anastazja", doctor);

        printAssignedDoctor(maciekPatient);
        printAssignedDoctor(anastazjaPatient);
    }

    private static void printAssignedDoctor(Patient patient) {
        if (patient.getDoctor() != null) {
            System.out.println(String.format("Patient %s is assigned to %s", patient.getName(), patient.getDoctor().getName()));
        } else {
            System.out.println(String.format("Patient %s does not have a doctor", patient.getName()));
        }
    }
}
