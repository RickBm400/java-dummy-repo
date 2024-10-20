package com.java_dummy_repo.demo_repo.models.Users;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("worker_user")
public class Workers extends AbstractUser {
    void addBookCopy() {

    }

    void removeBookCopy() {

    }

}
