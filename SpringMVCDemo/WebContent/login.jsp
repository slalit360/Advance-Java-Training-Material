<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="loginform" action="login.htm" >
<table> 
	<tr>
		<td>Username :</td>
		<td> <input type="text" id="uid" name="uname"  ></td>
	</tr>
	
	<tr>
		<td>Password :</td> 
		<td><input type="password" id="pid" name="pass" ></td>
	</tr>
	
	<tr><td> </td>
	<td><input type="submit" value="Login" onclick="return validate()" ></td></tr>

</table>
</form>

</body>
</html>