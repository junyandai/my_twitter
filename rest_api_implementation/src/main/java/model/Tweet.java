package model;

public class Tweet {
    private static int tweetIdCounter = 0;
    private int tweetId;
    private String title;
    private int authorId;
    private String content;


    protected Tweet() {
        this.tweetId = tweetIdCounter++;
        this.

    }

}
