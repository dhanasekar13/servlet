package com.ds;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Shooping1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String s1=req.getParameter("firstname");
		String s2=req.getParameter("lastname");
		String s3=req.getParameter("order");
		String s4=req.getParameter("status");
		String fortype=req.getParameter("hide");
		int value=parseInt(fortype);
	}
}
