package com.example.my_twitter.repository;

import com.example.my_twitter.model.Tweet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet> findAll();
    List<Tweet> findTweetByUserId(long userId);
    Tweet findById(long tweetID);

}
