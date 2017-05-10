package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class GaeServlet extends HttpServlet {
	int i=1;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		int j;
		DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
		PrintWriter o=resp.getWriter();
		Entity e1=new Entity("login",i);
		String g=req.getParameter("a1");
		String h=req.getParameter("a2");
		Key k1=KeyFactory.createKey("login",i);
		e1.setProperty("user id", g);
		e1.setProperty("password",h);
		if(!k1.equals(e1))
		{
		System.out.println();
		ds.put(e1);
		
		i++;
		j=i;
		}
		else
		{
			o.println("these user is already created the account");
		}
	}
}
