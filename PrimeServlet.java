package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response
            ) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num = Integer.parseInt(request.getParameter("number"));

            if (num < 0)
                throw new IllegalArgumentException("Number must be positive");

            boolean isPrime = true;

            if (num == 0 || num == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Result</h2>");
            out.println("Number: " + num + "<br>");

            if (isPrime)
                out.println("<p style='color:green;'>It is a Prime Number</p>");
            else
                out.println("<p style='color:red;'>Not a Prime Number</p>");

            out.println("<br><a href='index.html'>Try Again</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            showError(out, "Invalid input! Enter a valid number.");
        } catch (IllegalArgumentException e) {
            showError(out, e.getMessage());
        }
    }

    private void showError(PrintWriter out, String msg) {
        out.println("<html><body>");
        out.println("<h3 style='color:red;'>Error: " + msg + "</h3>");
        out.println("<a href='index1.html'>Go Back</a>");
        out.println("</body></html>");
    }
}