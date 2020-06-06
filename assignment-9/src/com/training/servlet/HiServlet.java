package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hi
 */
@WebServlet("/hi")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html color='blue'><head>");
		out.println("<title>HI</title></head>");
		out.println("<body><hr><h3>HI</h3><hr><br>");
		out.println("End point: " + request.getServletPath());
		out.println("<p> ----> You have been routed here by the DispatcherServlet</p></body>");
	}

}
