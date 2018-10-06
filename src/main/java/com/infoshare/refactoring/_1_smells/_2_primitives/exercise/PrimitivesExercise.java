package com.infoshare.refactoring._1_smells._2_primitives.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitivesExercise {

    private static final int PASSPORT = 1;
    private static final int ID_CARD = 2;
    private static final int BIRTH_CERTIFICATE = 3;

    public static void main(String[] args) {
        String firstName = "Maciek";
        boolean firstIsFromPoland = true;
        List<Integer> firstDocuments = Collections.singletonList(ID_CARD);

        String secondName = "Анастасия";
        boolean secondIsFromPoland = false;
        List<Integer> secondDocuments = Arrays.asList(PASSPORT, BIRTH_CERTIFICATE);

        String thirdName = "Лена";
        boolean thirdIsFromPoland = false;
        List<Integer> thirdDocuments = Arrays.asList(PASSPORT, BIRTH_CERTIFICATE);

        checkDocuments(firstName, firstIsFromPoland, firstDocuments);
        checkDocuments(secondName, secondIsFromPoland, secondDocuments);
        checkDocuments(thirdName, thirdIsFromPoland, thirdDocuments);
    }

    private static void checkDocuments(String name, boolean isFromPoland, List<Integer> documents) {
        boolean hasAllDocuments = hasAllRequiredDocuments(isFromPoland, documents);
        printMessage(name, hasAllDocuments);
    }

    private static boolean hasAllRequiredDocuments(boolean isFromPoland, List<Integer> documents) {
        if (isFromPoland) {
            return documents.contains(2);
        }

        return documents.contains(1) || documents.contains(3);
    }

    private static void printMessage(String name, boolean hasAllDocuments) {
        if (hasAllDocuments) {
            System.out.println("All required documents has been provided by " + name);
        }

        System.out.println("Several documents are missing. Sorry " + name);
    }
}
