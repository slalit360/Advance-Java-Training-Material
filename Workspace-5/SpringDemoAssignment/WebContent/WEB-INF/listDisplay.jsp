<%@page import="com.pojo.Product"%>
<%@page import="java.util.List"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--     pageEncoding="ISO-8859-1"%> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>Product Id</th><th>Product Name</th><th>Price</th></tr>
	<c:forEach var="index" items="${pList}">
		<tr>
		<td><c:out value="${index.pId}"></c:out></td>
		<td><c:out value="${index.pName}"></c:out></td>
		<td><c:out value="${index.price}"></c:out></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>