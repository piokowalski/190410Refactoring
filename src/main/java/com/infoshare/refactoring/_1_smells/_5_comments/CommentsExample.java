package com.infoshare.refactoring._1_smells._5_comments;

public class CommentsExample {

    public static void main(String[] args) {
        IsbnValidator isbnValidator = new IsbnValidator();

        String firstIsbn = "2-1234-5680-2";
        String secondIsbn = "2-1234-5680-21";
        String thirdIsbn = "978-2-1234-5680-3";

        System.out.println(String.format("Is %s correct isbn: %s", firstIsbn, isbnValidator.isValidIsbn(firstIsbn)));
        System.out.println(String.format("Is %s correct isbn: %s", secondIsbn, isbnValidator.isValidIsbn(secondIsbn)));
        System.out.println(String.format("Is %s correct isbn: %s", thirdIsbn, isbnValidator.isValidIsbn(thirdIsbn)));


        // TODO: Komentarze wyjasniaja rzeczy oczywiste
        // TODO: Kod ktory tlumacza komentarze mozna zapisac czytelniej
        // TODO: Komentarze sie dezaktualizuja
        // TODO: Kiedy warto komentarze napisac

    }
}
