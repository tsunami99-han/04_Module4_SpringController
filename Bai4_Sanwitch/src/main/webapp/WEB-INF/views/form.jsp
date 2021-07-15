
<%--
  Created by IntelliJ IDEA.
  User: Nguyen Viet Tien
  Date: 07/15/2021
  Time: 8:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <h1>Sandwich Condiment</h1>
    <input type="checkbox" name="condiment" value="Lecture">Lecture
    <input type="checkbox" name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts
    <hr>
    <br>
    <button name="Save">Save</button>
</form>
<hr>
<h2>Result:</h2>
<p>A sandwich with condiments: ${result}</p>
</body>
</html>