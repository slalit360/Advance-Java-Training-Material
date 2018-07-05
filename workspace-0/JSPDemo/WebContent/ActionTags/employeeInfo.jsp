<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.Employee" %>

<% 
int empid=Integer.parseInt(request.getParameter("empId"));
double salary=Double.parseDouble(request.getParameter("salary"));
%>

<jsp:useBean id="employee" class="com.Employee">
 
	<jsp:setProperty name="employee" property="empName" param="empName"/>
	<jsp:setProperty name="employee" property="empId" value="<%=empid%>"/>
	<jsp:setProperty name="employee" property="address" param="address"/>
	<jsp:setProperty name="employee" property="salary" value="<%=salary%>"/>
	
	<jsp:setProperty name="employee" property="*"/>
</jsp:useBean>
 
<h3>
EmpName : <jsp:getProperty name="employee" property="empName"/><br>
EmployeeId : <jsp:getProperty name="employee" property="empId"/><br>
Address : <jsp:getProperty name="employee" property="address"/><br>
Salary : <jsp:getProperty name="employee" property="salary"/><br>
</h3>
</body>
</html>