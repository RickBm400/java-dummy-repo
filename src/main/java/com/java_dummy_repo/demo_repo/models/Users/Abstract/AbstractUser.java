package com.java_dummy_repo.demo_repo.models.Users.Abstract;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public abstract class AbstractUser {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private long _id;


    private @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) Long Id;

    private String name;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date BirthDate;
    private Integer age;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
