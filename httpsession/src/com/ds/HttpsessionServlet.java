package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HttpsessionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
	PrintWriter o=	resp.getWriter();
	HttpSession s1=req.getSession(false);
	if(s1!=null)
	{
	String n1=(String)s1.getAttribute("name");
	String n2=(String)s1.getAttribute("password");
	if(n1.equals("dhana"))
	{
		if(n2.equals("dhana"))
		{
			o.println("hi dhanasekar ");
		}
	}
	}
	else
	{
		req.getRequestDispatcher("index.html").include(req, resp);
	}
	}
	
}
