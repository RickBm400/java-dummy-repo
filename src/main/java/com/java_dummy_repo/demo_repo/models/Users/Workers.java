package com.java_dummy_repo.demo_repo.models.Users;

import java.util.Date;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("WORKER_USER")
public class Workers extends AbstractUser {

    public Workers(String name, String lastName, Date birthDate, Integer age) {
        super(name, lastName, birthDate, age);

    }

    // void addBookCopy() {

    // }

    // void removeBookCopy() {

    // }

}
