package com.infoshare.refactoring._1_smells._5_comments;

public class IsbnValidator {

    public boolean isValidIsbn(String isbn) {

        // get rid of '-' sign
        String cleanIsbn = isbn.replace("-", "");

        // check if isbn contains only digits
        if (!cleanIsbn.matches("[0-9]+")) {
            return false;
        }

        // check if isbn has exact 10 letters
        if (cleanIsbn.length() == 10 || cleanIsbn.length() == 13) {
            return true;
        }

        return false;
    }
}
