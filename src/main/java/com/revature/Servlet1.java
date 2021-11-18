package com.revature;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet { // TODO: use servlets here
    private Employee employee;
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Welcome</title>");
//            out.println("</head>");
//            out.println("<style>");
//            out.println("@import url('https://fonts.googleapis.com/css2?family=PT+Mono&family=PT+Sans&display=swap');");
//            out.println("body{ font-family: 'PT Sans', sans-serif; }");
//            out.println("</style>");
//            out.println("<body>");
            int id = request.getIntHeader("id-field");
            String name = request.getParameter("name-field");
            String email = request.getParameter("email-field");
            int gender = request.getIntHeader("gender-field");
            String country = request.getParameter("country-field");
//            out.println("</body>");
//            out.println("</html>");
        }

        public Employee getEmployee() {
            return employee;
        }
}
