package com.java_dummy_repo.demo_repo.models.Users.Abstract;

import java.util.Date;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
public abstract class AbstractUser {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private long _id;

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long ID;

    private String name;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private Integer age;

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
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
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AbstractUser(String name, String lastName, Date birthDate, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
    }

    public AbstractUser() {
    }
}
