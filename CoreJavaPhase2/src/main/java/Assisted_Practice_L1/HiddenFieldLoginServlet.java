package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFieldLoginServlet
 */
@WebServlet("/HiddenFieldLoginServlet")
public class HiddenFieldLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sessionType = request.getParameter("sessionType");

        if ("hiddenFormField".equals(sessionType)) {
            request.setAttribute("username", username);
            request.getRequestDispatcher("HiddenFieldDashboardServlet").forward(request, response);
        } else {
            // Handle other session types
        }
    }

}
