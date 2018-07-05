<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
var xmlhttp = null;    
function add(){

	 var firstNo = document.getElementById("firstNo").value;
	 var secondNo = document.getElementById("secondNo").value;
	 
	xmlhttp=new XMLHttpRequest();
    xmlhttp.onreadystatechange=
    function()
    {
    	if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
    	{	 	
    			xmlDoc = xmlhttp.responseXML;

    		    var x = xmlDoc.getElementsByTagName("result")[0];
    		    var y = x.childNodes[0];
    		    document.getElementById("result").value = y.nodeValue; 
    		   
        }
    };

    xmlhttp.open("GET","http://localhost:6262/AdditonUsingAjaxXML/AddXml.jsp?firstNo="+firstNo+"&secondNo="+secondNo);
    
    xmlhttp.send();
}

</script>
</head>

<body>
<center><h1>Addition</h1><br>
First No:  <input type="text" id="firstNo"><br><br>
Second No: <input type="text" id="secondNo"><br><br>
Result : <input type="text" name="result" id="result"> <br><br>
<input type="button" id="Add" value="ADD" onclick="add()"> 

  </center>
</body>
</html>