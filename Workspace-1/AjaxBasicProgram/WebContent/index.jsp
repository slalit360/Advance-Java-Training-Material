<!DOCTYPE html>
<html>
<head>
<script>
function loadDoc(){
	var xmlhttp;
	if(window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
  	   xmlhttp=new XMLHttpRequest();
    }else {// code for IE6, IE5
       xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
	
    xmlhttp.onreadystatechange=function() {
        if (xmlhttp.readyState==4 && xmlhttp.status==200){
            document.getElementById("myDiv1").innerHTML=xmlhttp.responseText;
        }
    }
     xmlhttp.open("GET","ajax_info.txt",true);
     xmlhttp.send();
}
</script>
</head>
<body>
<div id="myDiv1"><h2>Let AJAX change this text</h2></div>
<button type="button" onclick="loadDoc()">Change Content</button>
</body>
</html>
