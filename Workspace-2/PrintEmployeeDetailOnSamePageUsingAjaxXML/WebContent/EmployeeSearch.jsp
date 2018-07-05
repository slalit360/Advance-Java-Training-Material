<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script type="text/javascript">
var xmlhttp = null;    
function searchData(){

	 var empId = document.getElementById("empId").value;
	 
	 
    xmlhttp=new XMLHttpRequest();
    xmlhttp.onreadystatechange=function()
    {
    	if (xmlhttp.readyState == 4 && xmlhttp.status == 200){
    		 	
    			xmlDoc = xmlhttp.responseXML;
    			
    			var table="<table border=1><tr><th>Employee ID</th><th>Name</th><th>Base Location</th></tr>";
    			
    			var x = xmlDoc.getElementsByTagName("result");
    			var y= x[0].getElementsByTagName("Employee");
    			
    			for (i = 0; i <y.length; i++) 
    			{ 
    			    table += "<tr><td>" +
    			    y[i].getElementsByTagName("empId")[0].childNodes[0].nodeValue +
    			    "</td><td>" +
    			    y[i].getElementsByTagName("empName")[0].childNodes[0].nodeValue +
    			    "</td><td>"+
    			   
    			    y[i].getElementsByTagName("baseLocation")[0].childNodes[0].nodeValue +
    			    "</td></tr>";
    			    
    			  }
    			 table+="</table>";
    			  document.getElementById("demo").innerHTML = table;
    			
        }
    };

    
    
    xmlhttp.open("GET","http://localhost:6262/PrintEmployeeDetailOnSamePageUsingAjaxXML/SearchAsPerEmpID.jsp?empId="+empId);

    
    xmlhttp.send();
}

</script>
</head>
<body>
<form action="">
<center><h1>Employee Information Search Page</h1></center>
<br><br>

<center>
Enter Employee ID : <input type="text" name="empId" id="empId"> 
<input type="button" value="Search" name="Search" onclick="searchData()">
</center>



</form>
<br><br><center><div id="demo"></div></center>

</body>
</html>