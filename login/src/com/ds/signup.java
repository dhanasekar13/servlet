package com.ds;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
@SuppressWarnings("serial")
public class signup extends HttpServlet {
	String name,email,phoneno,password;
	DatastoreService data=DatastoreServiceFactory.getDatastoreService();
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		String a1=req.getParameter("v1");
		String a2=req.getParameter("v2");
		String a3=req.getParameter("v3");
		String a4=req.getParameter("v4");
		name=a1;
		email=a2;
		phoneno=a3;
		password=a4;
		Entity e1=new Entity("dhana",name);
		
		e1.setProperty("name", name);
		e1.setProperty("email", email);
		e1.setProperty("phoneno", phoneno);
		e1.setProperty("password", password);
		data.put(e1);
		resp.sendRedirect("index.html");
	}
}
