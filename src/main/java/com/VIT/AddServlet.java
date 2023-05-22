package com.VIT;

import javax.servlet.http.*;

public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		try {
			res.getWriter().println("result is " + k);
		} catch (Exception e) {
			e.printStackTrace();
		};
	}
}