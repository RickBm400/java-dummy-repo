package com.java_dummy_repo.demo_repo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java_dummy_repo.demo_repo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepo) {
        this.userRepository = userRepo;
    }

    @GetMapping
    public String GetUserController() {
        return "Holamundo";
    }

}
