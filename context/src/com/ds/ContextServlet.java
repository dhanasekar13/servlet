package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ContextServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		PrintWriter out=resp.getWriter(); 
		try{  
			  
			resp.setContentType("text/html");  
			 
			  
			ServletContext context=getServletContext();  
			context.setAttribute("store name","DHANASEKAR STORE");  
			  
			out.println("Welcome to first servlet");  
			out.println("<a href='context1'>visit</a>");  
			out.close();  
			  
			}
		catch(Exception e){out.println(e);}  
			  
			}
	}

