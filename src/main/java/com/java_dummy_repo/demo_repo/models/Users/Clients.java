package com.java_dummy_repo.demo_repo.models.Users;

import com.java_dummy_repo.demo_repo.models.Users.Abstract.AbstractUser;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CLIENT_USER")
public class Clients extends AbstractUser {

    private String recidence;

    public Clients() {
        // super();
    }

    public String getrecidence() {
        return recidence;
    }

    public void setrecidence(String recidence) {
        this.recidence = recidence;
    }

    // class-owned methods

    public void borrowBook() {

    }

    public void returnBook() {

    }

    public void getBorrowedBooks() {

    }
}
