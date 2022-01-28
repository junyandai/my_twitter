package com.example.my_twitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Comment implements Serializable {
    
    private static final long serialVersionUID = -4140199432826347260L;
    private static int commentIdCounter = 0;

    @Id
    private long commentId;

    @Column(name = "authorId")
    private long authorId;

    @Column(name =  "authorName")
    private String authorName;

    @Column(name = "text")
    private String text;

    public Comment(long authorId, String authorName, String text) {
        this.commentId = commentIdCounter++;
        this.authorId = authorId;
        this.authorName = authorName;
        this.text = text;
    }

    public Comment(Comment comment) {
        this.commentId = comment.commentId;
        this.authorId = comment.authorId;
        this.authorName = comment.authorName;
        this.text = comment.text;
    }

    protected Comment() {

    }

}
