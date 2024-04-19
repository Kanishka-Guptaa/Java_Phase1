package Assisted_Practice_L2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataOperations")
public class DataOperationsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    	String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        
        try (Connection connection = DBConnection.getConnection()) {
            String query = "";
            if (request.getParameter("insert") != null) {
                query = "INSERT INTO student(name, age, email) VALUES (?, ?, ?)";
            } else if (request.getParameter("update") != null) {
                query = "UPDATE student SET age = ?, email = ? WHERE name = ?";
            } else if (request.getParameter("delete") != null) {
                query = "DELETE FROM student WHERE name = ?";
            }
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                if (request.getParameter("insert") != null) {
                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, age);
                    preparedStatement.setString(3, email);
                } else if (request.getParameter("update") != null) {
                    preparedStatement.setInt(1, age);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, name);
                } else if (request.getParameter("delete") != null) {
                    preparedStatement.setString(1, name);
                }
                
                int result = preparedStatement.executeUpdate();
                
                if (result > 0) {
                    response.getWriter().println("Operation successful.");
                } else {
                    response.getWriter().println("Operation failed.");
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
