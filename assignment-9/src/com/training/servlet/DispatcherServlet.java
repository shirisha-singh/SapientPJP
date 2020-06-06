package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DispatcherServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		PrintWriter out = response.getWriter();
//		out.println(path);
//		out.println("End-point is probably wrong. Check back buddy!!");
		
		RequestDispatcher requestDispatcher;
		ServletContext servletContext;
		
		String forHi = request.getContextPath() + "/hi";
		
		switch(path)
		{
			case "/hi":
				servletContext = getServletContext();
				requestDispatcher = servletContext
				.getRequestDispatcher("/hi");
				requestDispatcher.forward(request, response);
				break;
				
			case "/hello":
				servletContext = getServletContext();
				requestDispatcher = servletContext
				.getRequestDispatcher("/hello");
				requestDispatcher.forward(request, response);
				break;
				
			case "/bye":
				servletContext = getServletContext();
				requestDispatcher = servletContext
				.getRequestDispatcher("/bye");
				requestDispatcher.forward(request, response);
				break;
				
			default:
				out.println("<html><head>");
				out.println("<title>Home Page</title></head>");
				out.println("<body><h2>Welcome to the DispatcherServlet</h2><hr>");
				out.println("<p>Implemented end points are: <br><br>");
				out.print("'/hi': <a href='" + getServletContext().getContextPath() + "/hi'>Route to Hi page</a> </p>");
				out.print("'/hello': <a href='" + getServletContext().getContextPath() + "/hello'>Route to Hello page</a> </p>");
				out.print("'/bye': <a href='" + getServletContext().getContextPath() + "/bye'>Route to Bye page</a> </p>");
				out.println("</body> </html>");
				
		}
	}

}
