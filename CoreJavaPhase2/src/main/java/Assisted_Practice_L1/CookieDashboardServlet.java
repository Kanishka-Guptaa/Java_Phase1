package Assisted_Practice_L1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDashboardServlet
 */
@WebServlet("/CookieDashboardServlet")
public class CookieDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    String username = cookie.getValue();
                    response.getWriter().println("Welcome back, " + username + "! Session was handled with a cookie.");
                    return;
                }
            }
        }
        
        response.getWriter().println("You are not logged in! Session was not handled with a cookie.");

}
}
