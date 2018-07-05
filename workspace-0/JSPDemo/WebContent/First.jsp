<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP PAGE</title>
</head>
<body>
		<%!  
			int j=200;
			public int add(int a,int b)
			{
				return a+b;
			}
		%>	
		<%  
			int i=100;
			i=i+1;
			j=j+1;
			out.print(i);
		%>
	
	<h2>
		<%= "i = "+i %>
	</h2>
	
	<h2>
		<%= add(10,20) %>
	</h2>
</body>
</html>
