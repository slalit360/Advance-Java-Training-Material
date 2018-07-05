<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
var xmlhttp = null;  

function addition() 
{
	var a= document.getElementById("num1").value;
	var b= document.getElementById("num2").value;
	
	xmlhttp=new XMLHttpRequest();
	
	xmlhttp.onreadystatechange=function(){
		
		if(xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			xmlDoc = xmlhttp.responseXML;
			
			document.getElementById("result").value = xmlDoc.getElementsByTagName("rst")[0].childNodes[0].nodeValue;
		}
	};
	
	//var data = new FormData();
	//data.append("num1", a);
	//data.append("num2", b);
	
	//xmlhttp.open("POST", "http://localhost:6262/AJAX/addition.jsp");
	//xmlhttp.send("num1="+10+"&num2="+12);
	
	
		xmlhttp.open("GET","//http://localhost:6262/AJAX/addition.jsp?num1="+a+"&num2="+b);
		xmlhttp.send();
}
</script>
</head>
<body>

<form method="POST">
<center><h1>Addition</h1><br>
First No:  <input type="text" id="num1"><br><br>
Second No: <input type="text" id="num2"><br><br>
Result : <input type="text" name="result" id="result"> <br><br>
<input type="button" id="Add" value="ADD" onclick="addition()"> 

  </center>

</form>

</body>
</html>