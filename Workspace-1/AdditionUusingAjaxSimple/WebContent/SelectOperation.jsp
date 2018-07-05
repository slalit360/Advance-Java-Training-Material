<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
var xmlhttp = null;    
function add(myId){

	 var firstNo = document.getElementById("firstNo").value;
	 var secondNo = document.getElementById("secondNo").value;
	 
	 var btnPress = document.getElementById(myId).value;
	 alert(btnPress);	
   
	 xmlhttp=new XMLHttpRequest();
   
	 xmlhttp.onreadystatechange=function()
	 {
          if (xmlhttp.readyState == 4 && xmlhttp.status == 200){
       		  document.getElementById("result").value=xmlhttp.responseText;
    	  }
     };

     xmlhttp.open("GET","http://localhost:6262/AdditionUusingAjaxSimple/Operate.jsp?firstNo="+firstNo+"&secondNo="+secondNo+"&btnPress="+btnPress);
     xmlhttp.send();
}

</script>
</head>

<body>
<center><h1>Addition</h1><br>
First No:  <input type="text" id="firstNo"><br><br>
Second No: <input type="text" id="secondNo"><br><br>
Result : <input type="text" name="result" id="result"> <br><br>
<input type="button" id="Addition" value="ADD" onclick="add(this.id)"> 
<input type="button" id="Substraction" value="SUB" onclick="add(this.id)"> 

  </center>
</body>
</html>