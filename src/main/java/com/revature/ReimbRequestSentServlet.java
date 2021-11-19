package com.revature;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ReimbRequestSentServlet extends HttpServlet { // TODO: use servlets here
    private Reimbursement reimb;
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
//            TODO: Change this
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 1 - Reimbursement request sent</title>");
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
            String id = request.getParameter("id-field");
            String name = request.getParameter("name-field");
            int reimb = request.getIntHeader("reimb-field");

//            out.println("<p style=\"text-align: right;\">");
            out.println("<p>");
            out.println("ID: "+ id +"<br />");
            out.println("Name: "+ name +"<br /><br />");
            out.println("Reimbursement amount: <br />"+ reimb);
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
//            System.out.println("ID: "+ id);
//            System.out.println("Name: "+ name);
//            System.out.println("Email: "+ email);
//            System.out.println("Gender: "+ gender);
//            System.out.println("Country: "+ country);
            out.close();
        }

        public Reimbursement getReimbursement() {
            return reimb;
        }
}
