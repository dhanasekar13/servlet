package com.ds;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class invalidate extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		HttpSession hs1 = req.getSession(false);
		hs1.invalidate();
	}
}
