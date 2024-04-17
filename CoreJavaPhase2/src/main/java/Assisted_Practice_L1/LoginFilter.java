package Assisted_Practice_L1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */

@WebFilter(urlPatterns = {"/Account*", "/InfoPageServlet"})
public class LoginFilter implements Filter 
{
       
	 public void init(FilterConfig config) throws ServletException 
	 {
	    }

	    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
	    	HttpServletRequest request = (HttpServletRequest) req;
	        HttpServletResponse response = (HttpServletResponse) resp;

	        String servletPath = request.getServletPath();

	        PrintWriter out = response.getWriter();
	        out.println("Filter triggered: Request passed through LoginFilter for " + servletPath + "<br>");
	        
	        chain.doFilter(req, resp);
	    }

	    public void destroy() {
	    }

}
