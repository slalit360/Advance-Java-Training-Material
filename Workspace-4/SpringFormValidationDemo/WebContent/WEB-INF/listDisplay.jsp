<%@page import="com.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>EmpId</th><th>EmpName</th><th>Salary</th></tr>
<c:forEach var="index" items="${employeeList}">
<tr>
<td><c:out value="${index.empId}"></c:out></td>
<td><c:out value="${index.empName}"></c:out></td>
<td><c:out value="${index.salary}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>