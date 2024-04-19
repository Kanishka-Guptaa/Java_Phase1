package Assisted_Practice_L2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBOperations")
public class DBOperationsServlet extends HttpServlet 
{
	 private static final long serialVersionUID = 1L;
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException 
	 {
		 String dbName = request.getParameter("dbName");
		 String action = request.getParameter("action");
		 try
		 {
			 Connection connection = NewDBConnection.getConnection();
             Statement statement = connection.createStatement();
             if("Create Database".equals(action)) 
             {
            	 ResultSet resultSet = connection.getMetaData().getCatalogs();
	             boolean exists = false;
	             while (resultSet.next()) 
	             {
	            	 String databaseName = resultSet.getString(1);
	                 if (dbName.equals(databaseName)) 
	                 {
	                	 exists = true;
	                     break;
	                 }
	             }
	             resultSet.close();
                 if (exists) 
                 {
                	 response.getWriter().println("Database already exists. Please enter a different name.");
	             } 
                 else 
                 {
                	 statement.executeUpdate("CREATE DATABASE " + dbName);
	                 response.getWriter().println("Database created successfully.");
	             }

	         } 
             else if("Use Database".equals(action)) 
             {
            	 statement.executeUpdate("USE " + dbName);
	             response.getWriter().println("Using " + dbName + " database.");
             } 
             else if("Drop Database".equals(action)) 
             {
            	 statement.executeUpdate("DROP DATABASE IF EXISTS " + dbName);
	             response.getWriter().println("Database dropped successfully.");
	         }
         } 
		 catch (Exception e) 
		 {
			 e.printStackTrace();
	         response.getWriter().println("Error: " + e.getMessage());
	     }  
	 }
}
