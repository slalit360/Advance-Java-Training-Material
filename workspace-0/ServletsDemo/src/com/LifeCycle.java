package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int a;
    public LifeCycle() {
    }

	public void init(ServletConfig config) throws ServletException {
		a=0;
		System.out.println("Init");
		
	}

	public void destroy() {
		System.out.println("Done!");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		a=a+1;
		out.print("<h1> a= "+ a +" </h1>");
		int b=10;
		b=b+1;
		out.print("<h1> a= "+ b +" </h1>");
		System.out.println("Service...doGet");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
