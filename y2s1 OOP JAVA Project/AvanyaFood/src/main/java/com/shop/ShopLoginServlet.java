package com.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShopLoginServlet")
public class ShopLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = ShopDBUtil.validate(userName, password);
		
		if (isTrue == true) {
			List<Shop> shop = ShopDBUtil.getShop(userName);
			request.setAttribute("shopDetails", shop);
			
			RequestDispatcher dis = request.getRequestDispatcher("shopaccount.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='shopLogin.jsp'");
			out.println("</script>");
		}
		
	}
	
	
	

}
