package com.infoshare.refactoring._1_smells._5_nulls.exercise;

public class NullExercise {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Clean code", "Robert C. Martin"));
        library.addBook(new Book("Refactoring", "Martin Fowler"));

        String effectiveJava = library.getBookInformation("Effective Java");
        String javaInAction = library.getBookInformation("Java 8 in action");

        System.out.println(effectiveJava);
        System.out.println(javaInAction);

        library.rentBook("Effective Java");
        System.out.println(library.getBookInformation("Effective Java"));

        library.rentBook("Effective Java");
    }
}
