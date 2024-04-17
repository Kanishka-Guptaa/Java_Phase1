package Assisted_Practice_L1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoPageServlet
 */
@WebServlet("/InfoPageServlet")
public class InfoPageServlet extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 PrintWriter out = response.getWriter();
	        out.println("Info Page Servlet");
	}

	
}

