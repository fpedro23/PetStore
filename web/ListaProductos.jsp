<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 23/11/14
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="productos.Producto" errorPage="" %>


<html>
<head>
    <title></title>
</head>
<body>
<%
    Producto[] listaProductos = (Producto[]) request.getAttribute("listaProductos");

    for (int i = 0; i < listaProductos.length; i++) {
        out.println(listaProductos[i].getNombreProducto());
    }
%>
</body>
</html>
