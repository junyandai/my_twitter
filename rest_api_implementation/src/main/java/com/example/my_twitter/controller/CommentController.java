package com.example.my_twitter.controller;

import com.example.my_twitter.model.Comment;
import com.example.my_twitter.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class CommentController {

    @Autowired
    CommentRepository repository;



    @GetMapping("/comments/:{id}")
    public Comment commentLookUp(@PathVariable long id) {
        return repository.findById(id);
    }

    @PostMapping("/comments")
    public boolean writeComment(@RequestBody Comment comment) {
        repository.save(new Comment(comment));
        return true;
    }

    @DeleteMapping("/comments/:{id}")
    public boolean deleteComment(@PathVariable long id) {

        Comment target = repository.findById(id);

        if (target != null) {
            repository.delete(target);
            return true;
        } else {
            return false;
        }

    }

}
