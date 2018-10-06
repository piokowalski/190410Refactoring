package com.infoshare.refactoring._1_smells._6_duplications.exercise;

import java.util.Objects;

public class Article {

    private final String name;
    private final String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(name, article.name) &&
                Objects.equals(text, article.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, text);
    }
}
