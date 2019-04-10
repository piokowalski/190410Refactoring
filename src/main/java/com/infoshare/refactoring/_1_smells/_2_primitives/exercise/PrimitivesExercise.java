package com.infoshare.refactoring._1_smells._2_primitives.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitivesExercise {
    public static void main(String[] args) {
        Person first = new Person("Maciek",true,
                Collections.singletonList(Documents.ID_CARD));

        Person second = new Person("Анастасия", false,
                Arrays.asList(Documents.PASSPORT, Documents.BIRTH_CERTIFICATE));

        Person third = new Person("Лена", false,
                Arrays.asList(Documents.PASSPORT));

        checkDocuments(first.getName(), first.isFromPoland(), first.getDocuments());
        checkDocuments(secondName, secondIsFromPoland, secondDocuments);
        checkDocuments(thirdName, thirdIsFromPoland, thirdDocuments);
    }

    private static void checkDocuments(Person person) {
        boolean hasAllDocuments = hasAllRequiredDocuments(person);
        if (hasAllDocuments) {

        }
    }

    private static boolean hasAllRequiredDocuments(boolean isFromPoland, List<Integer> documents) {
        if (isFromPoland) {
            return documents.contains(2);
        }

        return documents.contains(1) && documents.contains(3);
    }

    private static void printMessage(String name, boolean hasAllDocuments) {
        if (hasAllDocuments) {
            System.out.println("All required documents has been provided by " + name);
        } else {
            System.out.println("Several documents are missing. Sorry " + name);
        }
    }
}
