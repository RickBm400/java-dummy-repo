package com.java_dummy_repo.demo_repo.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;
import com.java_dummy_repo.demo_repo.models.Users.Workers;
import com.java_dummy_repo.demo_repo.repository.UserRepository;
import com.java_dummy_repo.demo_repo.repository.WorkerRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private final WorkerRepository workerRepository;

    public UserController(UserRepository userRepo, WorkerRepository workRepo) {
        this.userRepository = userRepo;
        this.workerRepository = workRepo;
    }

    @GetMapping
    public ResponseEntity<String> GetUserController() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse("2001-06-29", formatter);

        userRepository.save(new Workers("Ricardo", "Barrios", java.sql.Date.valueOf(birthDate), 24));

        return ResponseEntity.ok("user created successfully nga");
    }

    @GetMapping("/getUser")
    public ResponseEntity<List<AbstractUser>> getMethodName(@RequestParam String name) {
        List<AbstractUser> users = userRepository.findByName(name);
        return ResponseEntity.ok(users);
    }

}
