package com.infoshare.refactoring._1_smells._6_duplications.exercise;

public class DuplicationExercise {

    public static void main(String[] args) {
        ArticleService articleService = new ArticleService();

        Article firstArticle = new Article("First article", "Bring to the table win-win survival strategies to ensure proactive domination.");
        Article secondArticle = new Article("Second article", "Leverage agile frameworks to provide a robust synopsis for high level overviews");

        articleService.createArticle(firstArticle);
        articleService.createArticle(secondArticle);

        articleService.readArticle(firstArticle.getName());
        articleService.readArticle(secondArticle.getName());
        articleService.deleteArticle(firstArticle.getName());

        articleService.deleteArticle(firstArticle.getName());
        articleService.readArticle(firstArticle.getName());
        articleService.readArticle(secondArticle.getName());
    }
}
