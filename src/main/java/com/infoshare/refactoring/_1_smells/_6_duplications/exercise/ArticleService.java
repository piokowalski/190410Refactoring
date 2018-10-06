package com.infoshare.refactoring._1_smells._6_duplications.exercise;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    private final List<Article> articles = new ArrayList<>();

    public void createArticle(Article article) {
        articles.add(article);
    }

    public void readArticle(String articleName) {
        Article found = null;
        for (Article a : articles) {
            if (a.getName().equals(articleName)) {
                found = a;
            }
        }
        if (found != null) {
            System.out.println("Article text: " + found.getText());
        } else {
            System.out.println(String.format("Article %s does not exists", articleName));
        }
    }

    public void deleteArticle(String articleName) {
        Article found = null;
        for (Article a : articles) {
            if (a.getName().equals(articleName)) {
                found = a;
            }
        }
        if (found != null) {
            articles.remove(found);
        } else {
            System.out.println(String.format("Article %s does not exists", articleName));
        }
    }
}
