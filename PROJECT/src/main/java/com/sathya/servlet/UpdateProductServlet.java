package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		String proBrand=request.getParameter("proBrand");
		Double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proMadeIN=request.getParameter("proMadeIN");
		Date proMfgDate =Date.valueOf(request.getParameter("proMfgDate"));
	    Date proExpDate =Date.valueOf(request.getParameter("proExpDate"));
		
		//using above details create the product object:
		product product=new product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProBrand(proBrand);
		product.setProPrice(proPrice);
		product.setProMadeIn(proMadeIN);
		product.setProMfgDate(proMfgDate);
		product.setProExpDate(proExpDate);
   		
		Part filePart=request.getPart("newProImage");
		if(filePart!=null &&filePart.getSize()>0)
		{
			InputStream inputStream=filePart.getInputStream();
			byte[] newImageData=IOUtils.toByteArray(inputStream);
			product.setProImage(newImageData);
		}
		else
		{
			Part part=request.getPart("existingImage");
			InputStream inputStream=part.getInputStream();
			byte[]existingImage=IOUtils.toByteArray(inputStream);
			product.setProImage(existingImage);
		}
		
		ProjectDao Dao=new ProjectDao();
		int updatecount=Dao.updateById(product);
		if(updatecount==1)
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("data updation fall check once..."+updatecount);
			RequestDispatcher dispatcher=request.getRequestDispatcher("add-product.html");
			dispatcher.forward(request, response);
			
		}	
	}
}
