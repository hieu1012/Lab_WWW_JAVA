package iu.fit.se.tuan1_dth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registration", value = "/registration")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Result Page</title></head>");
        out.println("<body>");
        out.println("<h1>Registration Result</h1>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}