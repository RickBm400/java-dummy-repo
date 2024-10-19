package com.java_dummy_repo.demo_repo.models;

import java.util.Date;
import jakarta.persistence.*;

public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long _id;

    private String name;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date BirthDate;
    private Integer age;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
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
