<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
var xmlHttp=null;

function add(mid) 
{
	var a=document.getElementById("num1").value;
	var b=document.getElementById("num2").value;
	var c=document.getElementById(mid).value;
	
	alert(c);
	
	xmlHttp=new XMLHttpRequest();
	
	xmlHttp.onreadystatechange=function(){
		
		if(xmlHttp.readyState==4 && xmlHttp.status==200)
		{
			document.getElementById("result").value=xmlHttp.responseText;	
		}
	};
	
	xmlHttp.open("GET","//http://localhost:6262/AJAX/addition.jsp?num1="+a+"&num2="+b+"&op="+c);
	xmlHttp.send();
		
}

</script>
</head>
<body>


<center>
	<h1>Operation</h1><br>
	First No:  <input type="text" id="num1"><br><br>
	Second No: <input type="text" id="num2"><br><br>
	Result : <input type="text" name="result" id="result"> <br><br>
	<input type="button" id="add" value="ADD" onclick="add(this.id)"> 
	<input type="button" id="sub" value="SUB" onclick="add(this.id)"> 

</center>
  
</body>
</html>