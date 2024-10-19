package com.java_dummy_repo.demo_repo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @GetMapping("/user")
    public String GetUserController(@RequestParam String param) {
        return "Accediendo a users";
    }
    
    
}
