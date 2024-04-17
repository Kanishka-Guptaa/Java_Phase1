package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLogoutServlet
 */
@WebServlet("/SessionLogoutServlet")
public class SessionLogoutServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        HttpSession session = request.getSession(false);
	        
	        if (session != null) {
	            session.invalidate(); // Invalidate the session
	            
	            response.setContentType("text/html");
	            response.getWriter().println("<h2>Logged out successfully!</h2>");
	            response.getWriter().println("<a href='SessionForm.html'>Login Again</a>");
	        } else {
	            response.sendRedirect("SessionForm.html");
	        }
	    }

}
