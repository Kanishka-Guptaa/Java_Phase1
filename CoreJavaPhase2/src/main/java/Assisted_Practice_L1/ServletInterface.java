package Assisted_Practice_L1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInterface
 */
@WebServlet("/ServletInterface")
public class ServletInterface implements Servlet 
{
	private ServletConfig config;

    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet is initialized.");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.getWriter().println("<html><head><title>Servlet Response</title></head><body>");
        res.getWriter().println("<h1>Servlet is Initiated!!!</h1>");
        res.getWriter().println("</body></html>");
    }

    public void destroy() {
        System.out.println("Servlet is destroyed.");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "HelloServlet";
    }

}
