package Assisted_Practice_L1;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param = request.getParameter("param");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>GET Request Response</title></head><body>");
        out.println("<h1>GET Request Received</h1>");
        out.println("<p>Parameter Value: " + param + "</p>");
        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("param");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>POST Request Response</title></head><body>");
        out.println("<h1>POST Request Received</h1>");
        out.println("<p>Parameter Value: " + param + "</p>");
        out.println("</body></html>");
		
	}

}
