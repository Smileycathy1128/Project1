package com.revature;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    static Configuration config;
    static SessionFactory sessionFactory;
    static Session session;
    static Transaction transaction;
    static EmployeeLoginOptionsServlet employeeLoginOptionsServlet;
    static ManagerLoginOptionsServlet managerLoginOptionsServlet;
    static ReimbRequestSentServlet reimbRequestSentServlet;

    public static void main( String[] args ) { // TODO: figure out where to put the Main method
        System.out.println("project started...");

        // create a configuration object
        config = new Configuration();
        // read the configuration and load in the object
        config.configure("hibernate.cfg.xml");
        // create factory
        sessionFactory = config.buildSessionFactory();

        // open the session
        session = sessionFactory.openSession();
        // begin the transaction
        transaction = session.beginTransaction();

        // create employee
//        Employee employee = new Employee("Mark", "m@gmail.com", "123");
//        employee.setId(1);
//        employee.setName("Mark");
//        employee.setEmail("m@gmail.com");

        employeeLoginOptionsServlet = new EmployeeLoginOptionsServlet();
        managerLoginOptionsServlet = new ManagerLoginOptionsServlet();
        reimbRequestSentServlet = new ReimbRequestSentServlet();
//        Reimbursement reimb = servlet1.getReimbursement(); // TODO: for finanical admins
        // save the employee
//        session.save(employee);
        // commit the transaction
        transaction.commit();
        // close the connection
        session.close();
    }
//    public void add2Table(Reimbursement reimb) {
//        App.session = App.sessionFactory.openSession();
//        App.transaction = App.session.beginTransaction();
//        App.session.save(reimb);
//        App.transaction.commit();
//        App.session.close();
//    }
}


