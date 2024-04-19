package Assisted_Practice_L2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoJDBC")
public class DemoJDBCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Connection connection = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");

        if ("Connect to Database".equals(action)) {
            connect(out);
        } else if ("Disconnect from Database".equals(action)) {
            disconnect(out);
        }
    }

    private void connect(PrintWriter out) 
    {
        try 
        {
            connection = DBConnection.getConnection();
            out.println("<html><body>");
            out.println("<h2>Database connection established successfully!</h2>");
            out.println("</body></html>");
            
        } 
        catch (Exception e) 
        {
            out.println("<html><body>");
            out.println("<h2>Error connecting to the database!</h2>");
            out.println("</body></html>");
            e.printStackTrace();
        }
    }

    private void disconnect(PrintWriter out) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                out.println("<html><body>");
                out.println("<h2>Database connection closed successfully!</h2>");
                out.println("</body></html>");
            } else {
                out.println("<html><body>");
                out.println("<h2>No active database connection!</h2>");
                out.println("</body></html>");
            }
        } catch (SQLException e) {
            out.println("<html><body>");
            out.println("<h2>Error closing the database connection!</h2>");
            out.println("</body></html>");
            e.printStackTrace();
        }
    }
}
