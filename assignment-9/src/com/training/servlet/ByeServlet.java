package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ByeServlet
 */
@WebServlet("/bye")
public class ByeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><head>");
		out.println("<title>BYE</title></head>");
		out.println("<body><hr><h3>BYE</h3><hr><br>");
		out.println("End point: " + request.getServletPath());
		out.println("<p> ----> You have been routed here by the DispatcherServlet</p></body>");
	}


}
