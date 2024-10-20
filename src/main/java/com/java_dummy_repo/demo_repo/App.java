package com.java_dummy_repo.demo_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    private final Environment env;

    @Autowired
    public App(Environment env) {
        this.env = env; // Inject Environment through constructor
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String globalGet() {
        String port = env.getProperty("server.port", "8080"); // Default to 8080 if not set
        return "Application running on port: " + port;
    }
}
