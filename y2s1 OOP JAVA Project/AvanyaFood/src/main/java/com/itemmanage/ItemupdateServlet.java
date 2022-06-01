package com.itemmanage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ItemupdateServlet")
public class ItemupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int ItemID =Integer.parseInt(request.getParameter("ItemID"));
		float price =Float.parseFloat(request.getParameter("price"));
		String Name =request.getParameter("Name");
		int shopID =Integer.parseInt(request.getParameter("shopID"));
		
		
		
		
		boolean isTrue;
		
		isTrue = ItemDBUtill.updateitem(ItemID,price,Name,shopID);
		
		 if(isTrue == true) {
			 
			 RequestDispatcher dis = request.getRequestDispatcher("itemmanage.jsp");
			 dis.forward(request, response);
			 
		 }else {
			 RequestDispatcher dis1 = request.getRequestDispatcher("ShopAddItemunsuccess.jsp");
			 dis1.forward(request,response);
		 }
		
		
	}

}
