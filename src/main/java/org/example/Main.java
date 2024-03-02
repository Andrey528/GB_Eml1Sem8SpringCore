package org.example;

import org.example.configs.ProjectConfig;
import org.example.models.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("Pushkin");
        comment.setText("My uncle...");
        service.publishComment(comment);
    }
}