package Assisted_Practice_L2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentDetails")
public class StudentDetailsServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();        
        String action = request.getParameter("action");

        if ("List Students".equals(action)) 
        {
            listStudents(out);
        } 
        else if ("Add Student".equals(action)) 
        {
            addStudentForm(out);
        }
    }

    private void listStudents(PrintWriter out) 
    {
        try 
        {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            out.println("<html><body>");
            out.println("<h2>Student List</h2>");
            out.println("<table border='1'>");
            out.println("<tr><th>ID</th><th>Name</th><th>Age</th><th>Email</th></tr>");

            while (resultSet.next()) 
            {
                out.println("<tr>");
                out.println("<td>" + resultSet.getInt("id") + "</td>");
                out.println("<td>" + resultSet.getString("name") + "</td>");
                out.println("<td>" + resultSet.getInt("age") + "</td>");
                out.println("<td>" + resultSet.getString("email") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body></html>");

            resultSet.close();
            statement.close();
            connection.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    private void addStudentForm(PrintWriter out) 
    {
        out.println("<html><body>");
        out.println("<h2>Add Student</h2>");
        out.println("<form action='StudentDetails' method='post'>");
        out.println("Name: <input type='text' name='name'><br>");
        out.println("Age: <input type='text' name='age'><br>");
        out.println("Email: <input type='text' name='email'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");

        try 
        {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate("INSERT INTO student (name, age, email) VALUES ('" + name + "', " + age + ", '" + email + "')");

            if (result > 0) 
            {
                out.println("<html><body>");
                out.println("<h2>Student added successfully!</h2>");
                out.println("<br>");
                out.println("<form action='StudentForm.html'>");
                out.println("<input type='submit' value='Go Back to Home Page'>");
                out.println("</form>");
                out.println("</body></html>");
            } 
            else 
            {
                out.println("<html><body>");
                out.println("<h2>Error adding student!</h2>");
                out.println("<br>");
                out.println("<form action='StudentForm.html'>");
                out.println("<input type='submit' value='Go Back to Home Page'>");
                out.println("</form>");
                out.println("</body></html>");
            }

            statement.close();
            connection.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
