package com.revature;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;
    private String gender;
    private String country;

    public Employee(){}

    public Employee(String id, String name, String email, String gender, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        setGender(gender);
        this.country = country;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
//        switch (gender) {
//            case 0:
//                return "male";
//            case 1:
//                return "female";
//            case 2:
//                return "non-binary";
//            default: // usually -1
//                return "unknown or other";
//        }
    }
    public void setGender(String gender) {
        this.gender = gender;
//        switch (gender) {
//            case "male":
//                this.gender = 0;
//                break;
//            case "female":
//                this.gender = 1;
//                break;
//            case "non-binary":
//                this.gender = 2;
//                break;
//            default:
//                this.gender = -1;
//                break;
//        }
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
