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

    private String Name;
    private String LastName;
    @Temporal(TemporalType.DATE)
    private Date BirthDate;
    private Integer Age;

    public AbstractUser(String name, String lastName, Date birthDate, Integer age) {
        Name = name;
        LastName = lastName;
        BirthDate = birthDate;
        Age = age;
    }

    public AbstractUser() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }
}
