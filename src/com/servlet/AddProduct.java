
package com.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.ProductService;

//This is the servlet used for adding products into the database
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService productService= new ProductService();
		System.out.println("inside servlet");
		
		com.model.AddProduct ap= new com.model.AddProduct(Integer.parseInt(request.getParameter("prodID")),request.getParameter("prodName"),request.getParameter("details"));
		
		productService.addProduct(ap);
		HttpSession session= request.getSession();
		session.setAttribute("sesname", request.getParameter("prodName"));
		
		//This function will take the user to the product added success page  
		response.sendRedirect("addproductsuccess.jsp");
	}
	

	
}