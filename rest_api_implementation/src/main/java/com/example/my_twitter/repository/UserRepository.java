package com.example.my_twitter.repository;

import com.example.my_twitter.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String Name);
    List<User> findAll();
    User findById(long id);




}


