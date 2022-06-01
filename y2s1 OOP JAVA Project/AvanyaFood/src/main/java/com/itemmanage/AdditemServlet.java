package com.itemmanage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdditemServlet")
public class AdditemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//int ItemID =Integer.parseInt(request.getParameter("ItemID"));
		String Name =request.getParameter("Name");
		float Price =Float.parseFloat(request.getParameter("Price"));
		//int shopID =Integer.parseInt(request.getParameter("shopID"));
		
		
		boolean isTrue;
		
		isTrue = ItemDBUtill.additem(Price,Name);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("ShopAddItemsuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("ShopAddItemunsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
