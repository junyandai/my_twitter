package com.example.my_twitter.controller;

import com.example.my_twitter.model.User;
import com.example.my_twitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

public class UserController {

    @Autowired
    UserRepository repository;



    @PostMapping ("/user/register")
    public long userRegister(@RequestBody User user) {
        repository.save(user);

        return user.getUserId();
    }

    @GetMapping("/user/by/username/:{username}")
    public List<User> userLookUp(@PathVariable String username) {

        return repository.findByName(username);
    }

    @PutMapping("/:{id}/change-password")
    public String changeUserPassword(String oldPassword,
                                     String newPassword,
                                     String newPasswordAgain,
                                     @PathVariable long id) {
        User target = repository.findById(id);

        if (target.changePassword(oldPassword, newPassword, newPasswordAgain)) {
            return "Successfully change the password";
        } else {
            return "Fail to change the password";
        }


    }



}
