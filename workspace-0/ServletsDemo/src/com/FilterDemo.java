package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FilterDemo implements Filter 
{

    public FilterDemo() {
        
    }
	
	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		PrintWriter pw=response.getWriter();
		pw.print("<h3>Before Service</h3> </br>");
		chain.doFilter(request, response);
		pw.print("<h3>After Service</h3> </br>");
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
}
