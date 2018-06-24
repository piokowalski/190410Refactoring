package com.infoshare.refactoring._1_smells._6_duplications;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    private final List<Article> articles = new ArrayList<>();

    public void createArticle(User user, Article article) {
        if (user.getRole().equals("EDITOR")) {
            articles.add(article);
        } else {
            System.out.println("Only editors can create articles.");
        }
    }

    public void readArticle(User user, String articleName) {
        if (user.getRole().equals("READER") || user.getRole().equals("EDITOR")) {
            Article found = null;
            for (Article a: articles) {
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
    }

    public void deleteArticle(User user, String articleName) {
        if (user.getRole().startsWith("EDI") && user.getRole().endsWith("TOR")) {
            Article found = null;
            for (Article a: articles) {
                if (a.getName().equals(articleName)) {
                    found = a;
                }
            }
            if (found != null) {
                articles.remove(found);
            }
        } else {
            System.out.println("Only editors can delete articles.");
        }
    }
}
