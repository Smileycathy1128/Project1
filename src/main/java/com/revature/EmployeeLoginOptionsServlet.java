package com.revature;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeLoginOptionsServlet extends HttpServlet {
    static HttpServletRequest request;
    static HttpServletResponse response;
    static PrintWriter out;
    private Reimbursement reimb;

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html; charset=UTF-8");
            EmployeeLoginOptionsServlet.request = request;
            EmployeeLoginOptionsServlet.response = response;

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

            String username = request.getParameter("username-field");
            String password = request.getParameter("password-field");

            Employee tempEmployee2 = App.session.get(Employee.class, username);
            if(tempEmployee2==null) {
                out.println("<p>cannot find username</p>");
            }
            else {
                if(tempEmployee2.getPassword().equals(password)) {
                    login(tempEmployee2);
                }
                else {
                    out.println("<p>incorrect password</p>");
                }
            }

//            ResultSet resultSet = DaoFactory.getResultSet("select * from 'employee'");
//            try {
//                while(resultSet.next()) {
//                    String tempUsername = resultSet.getString("username");
//                    if(tempUsername.equals(username)) {
//                        String tempPassword = resultSet.getString("password");
//                        if(tempPassword.equals(password)) {
//                            // log them in
//                            String tempName = resultSet.getString("name");
//                            Employee tempEmployee = new Employee(tempName, tempUsername, tempPassword);
//                            login(tempEmployee);
//                        }
//                        out.println("<p>incorrect password</p>");
//                    }
//                }
//                out.println("<p>cannot find username</p>");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
            out.println("</body>");
            out.println("</html>");
            out.close();

        }
        static void login(Employee employee) { // TODO: add reimbursement request button
            out.println("<p>");
            out.println("Name: "+ employee.getName() +"<br/>");
            out.println("Username: "+ employee.getUsername() +"<br/>");
            out.println("</p>");
            out.println("<button onclick=\"window.location='./reimbRequestForm.html';\">" +
                    "request reimbursement</button>\n");
        }
//        public Reimbursement getEmployee() {
//            return employee;
//        }
}
