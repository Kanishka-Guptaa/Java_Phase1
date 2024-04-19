package Assisted_Practice_L2;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductDetailsSP")
public class ProductDetailsSP extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    	String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        double productPrice = Double.parseDouble(request.getParameter("productPrice"));
        String productDescription = request.getParameter("productDescription");        
        int updateCount = 0;
        try 
        {
        	Connection connection = DBConnection.getConnection();
            CallableStatement callableStatement = connection.prepareCall("{call add_product(?, ?, ?, ?)}");
            callableStatement.setString(1, productId);
            callableStatement.setString(2, productName);
            callableStatement.setDouble(3, productPrice);
            callableStatement.setString(4, productDescription);
            updateCount = callableStatement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if (updateCount > 0) 
        {
            out.println("<h3>Product added successfully!</h3>");
        } 
        else 
        {
            out.println("<h3>Failed to add product. Please try again.</h3>");
        }
        out.println("<a href='StoredProceduresForm.html'>Back to Form</a>");
        out.close();
    }
}
