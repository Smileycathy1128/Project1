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

    public static void main( String[] args ) {
        System.out.println("project started...");

        // create a configuration object
        config = new Configuration();
        // read the configuration and load in the object
        config.configure("hibernate.cfg.xml");
        // create factory
        sessionFactory = config.buildSessionFactory();

        // open the session
//        session = sessionFactory.openSession();
        // begin the transaction
//        transaction = session.beginTransaction();

        // create employee
//        Employee employee = new Employee(2, "Mark", "m@gmail.com", "male", "USA");
//        employee.setId(1);
//        employee.setName("Mark");
//        employee.setEmail("m@gmail.com");

        ReimbRequestSentServlet servlet1 = new ReimbRequestSentServlet();
        Reimbursement reimb = servlet1.getReimbursement(); // TODO: Get from Servlet1
        // save the employee
//        session.save(reimb);
        // commit the transaction
//        transaction.commit();
        // close the connection
//        session.close();
    }


}
