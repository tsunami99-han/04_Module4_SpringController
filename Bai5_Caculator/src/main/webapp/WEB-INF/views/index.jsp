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
<form action="/calculate" method="post">
  <h1>Calculator</h1>
  <hr>
  <input type="text" name="value1" placeholder="Enter a number">
  <input type="text" name="value2" placeholder="Enter a number">
  <br>
  <br>
  <button name="cal" value="add">Addition(+)</button>
  <button name="cal" value="sub">Subtraction(-)</button>
  <button name="cal" value="mul">Multiplication(X)</button>
  <button name="cal" value="div">Division(/)</button>
</form>
<hr>
<h2>Result Division: ${result}</h2>
</body>
</html>