<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 24/11/14
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
</head>
<body>
<center>
    <h3>Welcome <i>${sessionScope.nombreUsuario}</i>, you have logged in successfully!</h3>

    <h3><a href="PetStore/logout">Logout</a></h3>
</center>
</body>
</html>