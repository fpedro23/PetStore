<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 23/11/14
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="productos.Item" errorPage="" %>


<html>
<head>
    <title></title>
</head>
<body>
<%
    Item item = (Item) request.getAttribute("item");
    out.println("Nombre Item: " + item.getNombreItem());
    out.println("ID Item:     " + item.getId());
    out.println("Precio :     " + item.getPrecio());
%>


</body>
</html>
