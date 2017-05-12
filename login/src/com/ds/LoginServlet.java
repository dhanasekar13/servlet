package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	signup s1 = new signup();
	Query q1 = new Query("dhana");
	PreparedQuery pq = s1.data.prepare(q1);
	String usern, emailn, phonen, passwn;
	String varr1 = s1.name, varr2 = s1.email, varr3 = s1.phoneno, varr4 = s1.password;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter o = resp.getWriter();
		resp.setContentType("text/html");
		String n12 = req.getParameter("var1");
		String p12 = req.getParameter("var2");
		for (Entity ew : pq.asIterable()) {
			usern = ew.getProperty("name").toString();
			emailn = ew.getProperty("email").toString();
			phonen = ew.getProperty("phoneno").toString();
			passwn = ew.getProperty("password").toString();
			if (usern.equals(n12)) {

				if (passwn.equals(p12)) {
					resp.sendRedirect("profile.html");
				} else {
					o.println("why this erro came need to find out");
				}
			}
		}
		o.println("Not yet register register again");

	}
}
