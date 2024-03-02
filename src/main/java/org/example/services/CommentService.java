package org.example.services;

import org.example.aspects.ToLog;
import org.example.models.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @ToLog
    public String publishComment(Comment comment) {
        System.out.printf("Comment author: %s, \n comment text: %s\n", comment.getAuthor(), comment.getText());
        return comment.getText();
    }
}
