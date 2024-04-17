package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HTTPSessionLoginServlet
 */
@WebServlet("/HTTPSessionLoginServlet")
public class HTTPSessionLoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "password".equals(password)) 
        {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("sessionType", "HttpSession");
            
            request.getRequestDispatcher("HTTPSessionDashboardServlet").forward(request, response);
        } 
        else 
        {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Login Failed!</h2>");
        }
    }

}
