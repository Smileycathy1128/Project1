package com.revature;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    private String name;
    @Id
    private String username; // also, the username
    private String password;

    public Employee() {}

    public Employee(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }
//    public void setName(String name) { this.name = name; }

    public String getUsername() {
        return username;
    }
//    public void setEmail(String email) { this.email = email; }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

//class Manager extends Employee {}
