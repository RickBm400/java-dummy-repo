package com.java_dummy_repo.demo_repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface _GlobalRepository<T,ID> extends JpaRepository<T, Long> {

    
}