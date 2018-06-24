package com.infoshare.refactoring._1_smells._4_nulls;

public class NullExample {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Mikolaj");

        Patient maciekPatient = new Patient("Maciek");
        Patient anastazjaPatient = new Patient("Anastazja", doctor);

        printAssignedDoctor(maciekPatient);
        printAssignedDoctor(anastazjaPatient);

        // TODO: Wyjaśnić, że nulle nie przekazują intencji a Optionale tak
        // TODO: pokazać niebezpieczeństwo nulli -> dodać funcjonalność assignment (Patient Date) i print assignment i zapomniec sprawdzic nulle
        // TODO: zrefactorowac
    }

    private static void printAssignedDoctor(Patient patient) {
        if (patient.getDoctor() != null) {
            System.out.println(String.format("Patient %s is assigned to %s", patient.getName(), patient.getDoctor().getName()));
        } else {
            System.out.println(String.format("Patient %s does not have a doctor", patient.getName()));
        }
    }
}
