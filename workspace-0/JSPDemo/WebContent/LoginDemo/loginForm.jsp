<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form HTML</title>

<script type="text/javascript">
	function validate()
	{
		uname=document.getElementById("uid").value;
		pass=document.getElementById("pid").value;
		
		if(uname==null || uname=="")
			{
				alert("Username is required");
				return false;
			}
		
		if(pass==null || pass=="")
		{
			alert("Password is required");
			return false;
		}
		return true;
		
	}
</script>
</head>
<body>

<form method="post" action="Login.jsp" >
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

