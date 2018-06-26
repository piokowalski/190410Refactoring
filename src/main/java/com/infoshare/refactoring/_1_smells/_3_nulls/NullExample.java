package com.infoshare.refactoring._1_smells._3_nulls;

public class NullExample {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Mikolaj");

        Patient maciekPatient = new Patient("Maciek");
        Patient anastazjaPatient = new Patient("Anastazja", doctor);

        System.out.println(getAssignedDoctorMessage(maciekPatient));
        System.out.println(getAssignedDoctorMessage(anastazjaPatient));
    }

    private static String getAssignedDoctorMessage(Patient patient) {
        if (patient.getDoctor() != null) {
            return String.format("Patient %s is assigned to %s", patient.getName(), patient.getDoctor().getName());
        } else {
            return String.format("Patient %s does not have a doctor", patient.getName());
        }
    }
}
