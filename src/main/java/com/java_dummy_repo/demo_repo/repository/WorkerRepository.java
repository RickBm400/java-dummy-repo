package com.java_dummy_repo.demo_repo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_dummy_repo.demo_repo.models.Users.Workers;

public interface WorkerRepository extends JpaRepository<Workers, Long> {
    List<Workers> findByName(String name);
}
