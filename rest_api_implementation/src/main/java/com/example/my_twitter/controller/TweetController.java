package com.example.my_twitter.controller;

import com.example.my_twitter.model.Tweet;
import com.example.my_twitter.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class TweetController {

    @Autowired
    TweetRepository repository;




    @GetMapping("/tweets/:{id}")
    public Tweet tweetLookUp(@PathVariable long id) {
        return repository.findById(id);
    }

    @PostMapping("/tweets")
    public long writeTweet(@RequestBody Tweet tweet) {
        repository.save(tweet);
        return tweet.getId();
    }

    @DeleteMapping("/tweets/:{id}")
    public boolean deleteTweet(@PathVariable long id) {
        Tweet target = repository.findById(id);

        if (target != null) {
            repository.delete(target);
            return true;
        } else {
            return false;
        }


    }



}
