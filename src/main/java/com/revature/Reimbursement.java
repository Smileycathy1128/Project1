package com.revature;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reimbursement {
    @Id
    private String id;
    private String name;
    private int amount;

    public Reimbursement(){}

    public Reimbursement(String id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
