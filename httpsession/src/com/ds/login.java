package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter o = resp.getWriter();
		// HttpSession s1=req.getSession();
		String v1 = req.getParameter("var1");
		String v2 = req.getParameter("var2");
		req.getRequestDispatcher("new.html").include(req, resp);
		
		if (v1.equals("dhana")) {
			if (v2.equals("dhana")) {
				HttpSession hs1 = req.getSession();
				hs1.setAttribute("name", v1);
				hs1.setAttribute("password", v2);

			} else {
				o.print("wrong password");
			}
		}

	}
}
