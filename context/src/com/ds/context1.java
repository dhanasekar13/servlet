package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class context1 {
	 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException  
	{  PrintWriter out=res.getWriter(); 
	try{  
	  
	res.setContentType("text/html");  
	 
	
	String n=(String)context.getAttribute("store name");  
	  
	out.println("Welcome to "+n);  
	out.close();  
	  
	}catch(Exception e){out.println(e);}  
	  
	}


}
