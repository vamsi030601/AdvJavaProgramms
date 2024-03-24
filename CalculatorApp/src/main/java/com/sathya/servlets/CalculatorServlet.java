package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
 
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
				
				int num1=Integer.parseInt(request.getParameter("first"));
				int num2=Integer.parseInt(request.getParameter("second"));
				String operation=(request.getParameter("operation"));
				int result=0;
				switch(operation)
				
				{
				case "+":result=num1+num2;
				break;
				case "-":result=num1-num2;
				break;
				case "*":result=num1*num2;
				break;
				case "/":result=num1/num2;
				break;
				case "%":result=num1%num2;
				break;
				}
				
				response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("<html>");
				writer.println("<body bgcolor=green>");
				writer.println("<br><br>");
				writer.println("<h1>Calculation Result..........</h1>");
				writer.println("<br><br>");
				writer.println("<p> The first number.."+num1+"</p>");
				writer.println("<br><br>");
				writer.println("<p> The second number.."+num2+"</p>");
				writer.println("<br><br>");
				writer.println("<p> The  operation is.."+operation+"</p>");
				writer.println("<br><br>");
				writer.println("<p> The result:"+result+"</p>");
				writer.println("<br><br>");
				writer.println("</body>");
				writer.println("</html>");
				}
				
			
			}	