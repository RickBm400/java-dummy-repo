package com.java_dummy_repo.demo_repo.models.Users;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("client_user")
public class Clients extends AbstractUser {
    
    private String location;

    public Clients() {
        // super();
    }


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
