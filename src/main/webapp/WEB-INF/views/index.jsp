<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/4/19
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form method="get" action="calculate">
    <input type="text" placeholder="0" name="firstOperand" value="${firstOperand}"><br>
    <input type="text" placeholder="0" name="secondOperand" value="${secondOperand}"><br>
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="*">
    <input type="submit" name="operator" value="/"><br>
    <span>Result ${operator}:${result}</span>
  </form>
  </body>
</html>
