package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping(value="users")
    public String createUser(@RequestParam("username") String username) {
        userService.createUser(username);
        return "User created successfully!";
    }
}
