package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HelloWorldSecond")
public class HelloWorldSecond extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloWorldSecond() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // IMPORTANT: Set content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<h2 style='color:blue;'>Hello World!!!</h2>");
        out.println("<p style='color:magenta;'>The server time is: " 
                     + new java.util.Date() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}