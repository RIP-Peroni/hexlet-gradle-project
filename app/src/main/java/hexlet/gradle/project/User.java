package main.java.hexlet.gradle.project;

import java.util.Date;
import java.util.Objects;

public class User {
    private String name;
    private Date birthdate;

    public User(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", birthdate: " + getBirthdate();
    }
}
