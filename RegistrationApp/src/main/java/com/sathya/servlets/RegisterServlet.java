package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   String username=request.getParameter("username");
	   String password=request.getParameter("password");
	   Long mobile=Long.parseLong(request.getParameter("mobile"));
	   String email=request.getParameter("email");
	   String gender=request.getParameter("gender");
	   String dob=request.getParameter("dob"); 
	   String[]qualification =request.getParameterValues("qualification");
	   String country=request.getParameter("country"); 
	   String[]language=request.getParameterValues("language");
	   String comments=request.getParameter("comments");
	   
	   String q=String.join(",",qualification);
	   String l=String.join("-",language);
	   
	   response.setContentType("text/html");
	   PrintWriter writer=response.getWriter();
	   writer.println("<html>");
	   writer.println("<body>");
	   writer.println("your username...."+username+"<br>");
	   writer.println("your password...."+password+"<br>");
	   writer.println("your mobilenumber...."+mobile+"<br>");
	   writer.println("your email...."+email+"<br>");
	   writer.println("your gender...."+gender+"<br>");
	   writer.println("your dob...."+dob+"<br>");
	   writer.println("your qualification...."+qualification+"<br>");
	   writer.println("your country...."+country+"<br>");
	   writer.println("your language...."+language+"<br>");
	   writer.println("your comments...."+comments+"<br>");
	   writer.println("</body>");
	   writer.println("</html>");
	   
	   
	}

}
