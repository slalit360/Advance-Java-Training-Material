<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD Product Page</title>
<script type="text/javascript">

</script>
</head>
<body>

 <form:form name="form1"  action="addProduct1.htm" modelAttribute="product"><!-- commandName="login" is ClassName with lower start anme -->
	<center><h2>Login Page</h2></center>

	<table width="50%"  align="center" border="0">
		<tr>
			<td>Product ID : </td>
			<td><form:input path="pId"/></td>
		</tr>
		<tr>
			<td>Product Name : </td>
			<td><form:input path="pName"/></td>
		</tr>		
		 
		 <tr>
			<td>Price : </td>
			<td><form:input path="price"/></td>
		</tr>
		 <tr>
			<td colspan="2" align="center">
			<input type="submit"  value="ADD"></td>
		 </tr>	
		  <tr>
			<td colspan="2" align="center">${ERROR}</td>
		 </tr>	
		</table>

</form:form>


</body>
</html>