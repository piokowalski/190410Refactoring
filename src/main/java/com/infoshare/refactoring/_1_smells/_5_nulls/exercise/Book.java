package com.infoshare.refactoring._1_smells._5_nulls.exercise;

public class Book {

    private String title;
    private String author;
    private boolean isRented;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return isRented;
    }

    public Book rent() {
        this.isRented = true;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
