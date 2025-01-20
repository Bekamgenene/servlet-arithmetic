// Square Servlet (SquareServlet.java)
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SquareServlet")
public class SquareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sum = (int) request.getAttribute("sum");
        int square = sum * sum;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Arithmetic Results</h2>");
        out.println("<p>Sum: " + sum + "</p>");
        out.println("<p>Square of the Sum: " + square + "</p>");
    }
}