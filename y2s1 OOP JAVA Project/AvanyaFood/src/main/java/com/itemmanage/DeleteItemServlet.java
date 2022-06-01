package com.itemmanage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteItemServlet
 */
@WebServlet("/DeleteItemServlet")
public class DeleteItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ItemID =request.getParameter("ItemID");
		
		
boolean isTrue;
		
		isTrue = DeleteDB.delete(ItemID);
		
		 if(isTrue == true) {
			 
			 RequestDispatcher dis = request.getRequestDispatcher("itemdelete.jsp");
			 dis.forward(request, response);
			 
		 }else {
			 RequestDispatcher dis1 = request.getRequestDispatcher("itemnotdelete.jsp");
			 dis1.forward(request,response);
		 }
		
		
	
	}

}
