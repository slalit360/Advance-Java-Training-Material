<%@page import="com.sun.org.apache.xerces.internal.dom.DocumentImpl"%>
<%
if(request.getParameter("num1")!=null && request.getParameter("num2")!=null)
{
	Integer a=Integer.parseInt(request.getParameter("num1"));
	Integer b=Integer.parseInt(request.getParameter("num2"));
	
	response.setContentType("text/xml");
	response.setHeader("Cache-Control", "no-cache");
	
	String sumXml = "<?xml version='1.0' encoding='UTF-8'?>" +"<rst>";
	try {
			sumXml += (a + b);
		} catch (Exception e) {
		sumXml += "error";
	}
	sumXml += "</rst>";
	
	response.getWriter().write(sumXml);
}
else{
	response.setStatus(HttpServletResponse.SC_NO_CONTENT);
}


%>