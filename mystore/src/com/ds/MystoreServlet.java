package com.ds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MystoreServlet extends HttpServlet {
	int g,h,i;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter o=resp.getWriter();

		resp.setContentType("text/html");
		String ab1=req.getParameter("a1");
		String ab2=req.getParameter("a2");
		g=Integer.parseInt(ab1);
		h=Integer.parseInt(ab2);
		RequestDispatcher r2=req.getRequestDispatcher("login.html");
		r2.forward(req,resp);
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter o=resp.getWriter();

		resp.setContentType("text/html");
		String qq=req.getParameter("z1");
		
		i=Integer.parseInt(qq);
		
		if(i==1)
			
		{   ServletConfig config=getServletConfig();  
	    String driver=config.getInitParameter("shop name");  
	    o.print("shop "+driver);  
			o.println("<br><br><br> The addition of 2 no is<br><br>");
			o.println(g+h);
			
		}
		if(i==2)
		{ o.println("<br><br><br> subration of 2 no is<br><br>");
			o.println(g-h);
		}
		if(i==3)
		{ o.println("<br><br><br> The multiplication of 2 no is<br><br>");
			o.println(g*h);
		}
		if(i==4)
		{ o.println("<br><br><br> The divison of 2 no is<br><br>");
			o.println(g/h);
		}
		if(i==5)
		{ o.println("<br><br><br> The percentage value  of 2 no is<br><br>");
			o.println(g%h);
		}
	}
}
