<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form:form name="form1"  action="login.htm" commandName="loginForm" method="POST" >
	<center><h2>Login Page</h2></center>

	<table width="50%"  align="center" border="0">
		<tr>
			<td>User Name</td>
			<td><form:input path="userName"/> &nbsp;&nbsp; <font color="red"> <form:errors path="userName" class="errors"/> </font></td> 
		</tr>
		<tr>
			<td>Password</td>
			<td><form:input path="password"/> &nbsp;&nbsp; <font color="red"> <form:errors path="password" class="errors"/> </font></td> 
		</tr>		
		 
		 <tr>
			<td colspan="2" align="center">
			<input type="submit" value="Login"></td>
		 </tr>	
		 
		</table>

</form:form>


</body>
</html>