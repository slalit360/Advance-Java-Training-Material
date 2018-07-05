<!DOCTYPE html>
<html>
<head>


<script>
function myFunctionAdd() {
    var node = document.createElement("LI");
    var textnode = document.createTextNode("Ajax");
    node.appendChild(textnode);
    document.getElementById("myList").appendChild(node);
   
  // var list = document.getElementById("myList").hasChildNodes();
  // document.getElementById("demo").innerHTML = list;
}

function myFunctionRemove() {
    var list = document.getElementById("myList");
    list.removeChild(list.childNodes[0]);
}
</script>

</head>

<body>

<ul id="myList">
  <li>Java</li>
  <li>C++</li>
</ul>

<p>Click the button to append an item to the end of the list.</p>

<button onclick="myFunctionAdd()">Add Node</button>
<button onclick="myFunctionRemove()">Remove Node</button>



</body>
</html>