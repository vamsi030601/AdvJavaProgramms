package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ 
	
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String status;
	
	
	if(username.equals("vamsi") && password.equals("vamsi@123"))
	{
		status="login successfull";
	}
	else
	{
		status="login failed";
	}
	  
	PrintWriter writer =  response.getWriter();
	   response.setContentType("text/html");
	  writer.println("<html>");
	  writer.println("<h1> login status...</h1>"+status);
	  writer.println("</html>");
	
}
}
	

