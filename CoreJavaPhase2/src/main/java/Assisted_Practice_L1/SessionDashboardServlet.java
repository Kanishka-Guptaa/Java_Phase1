package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDashboardServlet
 */
@WebServlet("/SessionDashboardServlet")
public class SessionDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        
        if (session != null && session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");

            response.setContentType("text/html");
            response.getWriter().println("<h2>Welcome, " + username + "!</h2>");
            response.getWriter().println("<a href='SessionLogoutServlet'>Logout</a>");
        } else {
            response.sendRedirect("SessionForm.html");
        }
    }

}
