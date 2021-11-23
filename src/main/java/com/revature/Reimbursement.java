package com.revature;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reimbursement {
    @Id
    private String timeSent;
    private String name;
    private String username;
    private double amount;

    public Reimbursement(){}

    public Reimbursement(String name, String username, int amount) {
        this.name = name;
        this.username = username;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public double getAmount() {
        return amount;
    }

    public void add2Table() {
        App.session = App.sessionFactory.openSession();
        App.transaction = App.session.beginTransaction();
        App.session.save(this);
        App.transaction.commit();
        App.session.close();
    }
}
