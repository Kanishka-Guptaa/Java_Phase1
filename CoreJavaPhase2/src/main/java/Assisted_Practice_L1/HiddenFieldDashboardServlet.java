package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFieldDashboardServlet
 */
@WebServlet("/HiddenFieldDashboardServlet")
public class HiddenFieldDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = (String) request.getAttribute("username");

        response.setContentType("text/html");
        response.getWriter().println("<h2>Welcome, " + username + "!</h2>");
    }

}
