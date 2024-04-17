package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class URLRewriteDashboardServlet
 */
@WebServlet("/URLRewriteDashboardServlet")
public class URLRewriteDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("username") != null) {
            response.getWriter().println("Welcome, " + session.getAttribute("username"));
            response.getWriter().println("Session handled with URL rewriting: " + request.isRequestedSessionIdFromURL());
        } else {
            response.sendRedirect("URLRewriteForm.html");
        }
    }

}
