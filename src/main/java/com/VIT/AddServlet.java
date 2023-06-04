package com.VIT;

import java.io.IOException;

import javax.servlet.http.*;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		res.sendRedirect("sq?k="+k);
	}
}