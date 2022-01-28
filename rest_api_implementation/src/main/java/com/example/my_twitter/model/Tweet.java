package com.example.my_twitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Tweet implements Serializable {

    private static final long serialVersionUID = 7346276004936597486L;
    private static int tweetIdCounter = 0;

    @Id
    private long tweetId;

    @Column(name ="title")
    private String title;

    @Column(name = "authorId")
    private long authorId;

    @Column(name = "text")
    private String text;


    public Tweet(String title, long authorId, String text) {
        this.tweetId = tweetIdCounter++;
        this.authorId = authorId;
        this.text = text;

    }


    public Tweet(Tweet tweet) {
        this.tweetId = tweet.tweetId;
        this.authorId = tweet.authorId;
        this.text = tweet.text;

    }

    protected Tweet() {

    }


    public long getId() {
        return this.tweetId;
    }

}
