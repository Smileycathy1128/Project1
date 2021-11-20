package com.revature;

import com.mysql.cj.log.Log;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginOptionsServlet extends HttpServlet { // TODO:
    static HttpServletRequest request;
    static HttpServletResponse response;
    static PrintWriter out;
    private Reimbursement employee;

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html; charset=UTF-8");
            LoginOptionsServlet.request = request;
            LoginOptionsServlet.response = response;

            out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 0 - What did I type in?</title>");
            out.println("</head>");
            out.println("<style>");
            out.println("@import url('https://fonts.googleapis.com/css2?family=PT+Mono&family=PT+Sans&display=swap');");
            out.println("body{" +
                    "            padding: 1rem;\n" +
                    "            line-height: 2rem;\n" +
                    "            font-family: 'PT Mono', monospace;\n" +
                    "            font-family: 'PT Sans', sans-serif;\n" +
                    "            text-align: right;" +
                    "}");
            out.println("</style>");
            out.println("<body>");

            String email = request.getParameter("email-field");
            String password = request.getParameter("password-field");

            ResultSet resultSet = DaoFactory.getResultSet("select * from 'employee'");
            try {
                while(resultSet.next()) {
                    String tempEmail = resultSet.getString("email");
                    if(tempEmail.equals(email)) {
                        String tempPassword = resultSet.getString("password");
                        if(tempPassword.equals(password)) {
                            // log them in
                            String tempId = resultSet.getString("id");
                            String tempName = resultSet.getString("name");
                            Employee tempEmployee = new Employee(tempId,tempName,tempEmail,tempPassword);
                            login(tempEmployee);
                        }
                        out.println("<p>wrong password</p>");
                    }
                }
                out.println("<p>cannot find email</p>");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            out.println("</body>");
            out.println("</html>");
            out.close();

        }
        static void login(Employee employee) {
            out.println("<p style=\"text-align: right;\">");
            out.println("ID: "+ employee.getId() +"<br/>");
            out.println("Name: "+ employee.getName() +"<br/>");
            out.println("Email: "+ employee.getEmail() +"<br/>");
            out.println("</p>");
        }
//        public Reimbursement getEmployee() {
//            return employee;
//        }
}
