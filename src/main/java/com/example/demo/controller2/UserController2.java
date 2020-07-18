package com.example.demo.controller2;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("user2")
public class UserController2 {
    @PostMapping("/addUser")
    public User addUser(@RequestBody @Valid User user) {

        return user;
    }
}
