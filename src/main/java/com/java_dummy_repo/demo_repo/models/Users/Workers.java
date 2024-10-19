package com.java_dummy_repo.demo_repo.models.Users;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "workers")
public class Workers extends AbstractUser {
    void addBookCopy() {

    }

    void removeBookCopy() {

    }

}
