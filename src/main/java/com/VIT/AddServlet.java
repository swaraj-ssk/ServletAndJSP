package com.VIT;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
	
		
		//Cookie
		Cookie cookie = new Cookie("k", k+""); // Pass k as string so k+""
		res.addCookie(cookie); // add cookie to response
		
		res.sendRedirect("sq");
	}
}