package com.java_dummy_repo.demo_repo.models.Users;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Clients extends AbstractUser {

    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // class-owned methods

    public void borrowBook() {

    }

    public void returnBook() {

    }

    public void getBorrowedBooks() {

    }
}
