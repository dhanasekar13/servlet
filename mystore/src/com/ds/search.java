package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class search extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter o = resp.getWriter();

		resp.setContentType("text/html");
		String ab1 = req.getParameter("g1");
	
		resp.sendRedirect("http://www.google.com?search="+ab1);
	}
}
