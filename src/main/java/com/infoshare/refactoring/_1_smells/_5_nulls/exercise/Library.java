package com.infoshare.refactoring._1_smells._5_nulls.exercise;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public String getBookInformation(String title) {
        Book book = getBook(title);
        if (book != null) {
            return book.toString();
        }

        return "Book '" + title + "' is not available";
    }

    public Book rentBook(String title) {
        return getBook(title).rent();
    }

    private Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isRented()) {
                return book;
            }
        }

        return null;
    }
}
