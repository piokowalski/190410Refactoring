package com.infoshare.refactoring._1_smells._6_duplications;

public class DuplicationExample {

    public static void main(String[] args) {
        ArticleService articleService = new ArticleService();

        User editor = new User("EDITOR", "John");
        User writer = new User("READER", "Mark");

        Article firstArticle = new Article("First article", "Bring to the table win-win survival strategies to ensure proactive domination.");
        Article secondArticle = new Article("Second article", "Leverage agile frameworks to provide a robust synopsis for high level overviews");

        articleService.createArticle(editor, firstArticle);
        articleService.createArticle(editor, secondArticle);

        articleService.readArticle(writer, firstArticle.getName());
        articleService.readArticle(writer, secondArticle.getName());
        articleService.deleteArticle(writer, firstArticle.getName());

        articleService.deleteArticle(editor, firstArticle.getName());
        articleService.readArticle(writer, firstArticle.getName());
        articleService.readArticle(writer, secondArticle.getName());
    }
}
