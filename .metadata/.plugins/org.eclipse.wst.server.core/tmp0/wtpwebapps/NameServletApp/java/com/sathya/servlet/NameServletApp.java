package com.sathya.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
 
@WebServlet("/NameServletApp")
public class NameServletApp extends HttpServlet {


 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String firstname=request.getParameter("firstname");
	String middlename=request.getParameter("middlename");
	String lastname=request.getParameter("lastname");
	
	String status;
	
	if(firstname.equals("sanamandra")&& middlename.equals("vamsi")&&lastname.equals("sukumar"))
	{
		status=firstname+"  "+middlename+"  "+lastname;
	}
	else
	{
		status="not valid";
	}
	 response.setContentType("text/html");
	 
	PrintWriter writer=response.getWriter();
	writer.println("<html>");
	writer.println("<h1> fullname is </h1> "+status);
	
	writer.println("</html>");
	
 }
}
	 
	