package com.infoshare.refactoring._1_smells._2_primitives.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.infoshare.refactoring._1_smells._2_primitives.exercise.Documents.*;

public class PrimitivesExercise {
    public static void main(String[] args) {
        Person first = new Person("Maciek",true,
                Collections.singletonList(ID_CARD));

        Person second = new Person("Анастасия", false,
                Arrays.asList(PASSPORT, BIRTH_CERTIFICATE));

        Person third = new Person("Лена", false,
                Arrays.asList(PASSPORT));

        checkDocuments(first);
        checkDocuments(second);
        checkDocuments(third);
    }

    private static void checkDocuments(Person person) {
        boolean hasAllDocuments = hasAllRequiredDocuments(person);
        if (hasAllDocuments) { printSuccessMessage(person);
        } else {
            printWarningMessage(person);
        }
    }

    private static boolean hasAllRequiredDocuments(Person person) {
        if (person.isFromPoland()) {
            return person.getDocuments().contains(ID_CARD);
        }

        return person.getDocuments().contains(PASSPORT) && person.getDocuments().contains(BIRTH_CERTIFICATE);
    }

    private static void printSuccessMessage(Person person) {
        System.out.println("All required documents has been provided by " + person.getName());
    }

    private static void printWarningMessage(Person person) {
        System.out.println("Several documents are missing. Sorry " + person.getName());
    }
}