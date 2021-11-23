package com.revature;

public class ManagerLoginOptionsServlet extends EmployeeLoginOptionsServlet{
    static void login(Manager manager) { // TODO: add reimbursement request button
        out.println("<p style=\"text-align: right;\">");
        out.println("Name: "+ manager.getName() +"<br/>");
        out.println("Username: "+ manager.getUsername() +"<br/>");
        out.println("</p>");
        out.println("<button onclick=\"window.location='./reimbList.html';\">" +
                "approve/deny reimbursement</button>\n");
    }
}
