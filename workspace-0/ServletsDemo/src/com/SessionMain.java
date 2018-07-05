package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		PrintWriter out=response.getWriter();
		out.print("<h1>Session Servlet Main</h1>");
		out.print("<h1>"+uname+" :- "+pass+"</h1>");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("Name", uname);
		
		out.print("<a href='SessionServlet'>click</a>");
		
		Cookie ck=new Cookie("shareValue", uname);
		response.addCookie(ck);
		
		
	}

}
