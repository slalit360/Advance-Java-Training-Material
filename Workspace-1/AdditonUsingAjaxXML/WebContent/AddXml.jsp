
<%@page import="java.io.PrintWriter"%>
<%@page import="com.sun.org.apache.xerces.internal.dom.DocumentImpl"%>
<%
	if (request.getParameter("firstNo") != null && request.getParameter("secondNo") != null) 
	{
		Integer firstNo = Integer.parseInt(request.getParameter("firstNo"));
		Integer secondNo =  Integer.parseInt(request.getParameter("secondNo"));
		
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");
		
		String sumXml = "<?xml version='1.0' encoding='UTF-8'?>" +"<result id=\"resid\">";
		try {
			sumXml += (firstNo + secondNo);
		} catch (Exception e) {
			sumXml += "error";
		}
		sumXml += "</result>";
		
		
		response.getWriter().write(sumXml);
	} 
	else 
	{
		//nothing to show
		//response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}

	

%>

