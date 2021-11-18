package com.revature;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
        System.out.println("project started...");

        // create a configuration object
        Configuration cfg = new Configuration();

        // read the configuration and load in the object
        cfg.configure("hibernate.cfg.xml");

        // create factory
        SessionFactory factory = cfg.buildSessionFactory();
        // open the session
        Session session = factory.openSession();
        // begin the transaction
        Transaction t = session.beginTransaction();

        // create employee
//        Employee employee = new Employee(2, "Mark", "m@gmail.com", "male", "USA");
//        employee.setId(1);
//        employee.setName("Mark");
//        employee.setEmail("m@gmail.com");
        // TODO: run page 1, which runs servlet 1
        Servlet0 servlet1 = new Servlet0();
        Employee employee = servlet1.getEmployee(); // TODO: Get from Servlet1
        // save the employee
        session.save(employee);
        // commit the transaction
        t.commit();
        // close the connection
        session.close();
    }


}
