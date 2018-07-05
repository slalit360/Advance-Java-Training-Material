package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Sessionservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print("<h2>Session Servlet-2</h2>");
		
		HttpSession hs=request.getSession();
		String nm=(String) hs.getAttribute("Name");
		pw.print("<h3> hello, "+ nm +" (Using_Session).</h3>");
		pw.print("<h3> SessionID : "+hs.getId()+"</h3>");
		hs.invalidate();
		
		String nm1=request.getParameter("name");
		pw.print("<h3> hello, "+ nm1 +" (Using_Url).</h3>");
		
		Cookie[] ck=request.getCookies();
		pw.print("<h3> hello, "+ ck[1].getValue() +" (Using_Cookies).</h3>");
		pw.print("<a href='SessionServlet'>Back</a>");
	}

}
