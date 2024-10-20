
package com.java_dummy_repo.demo_repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

public interface UserRepository extends JpaRepository<AbstractUser, Long> {

}