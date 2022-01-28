package com.example.my_twitter.repository;

import com.example.my_twitter.model.Comment;
import com.example.my_twitter.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    List<Comment> findAll();
    Comment findById(long id);
}
