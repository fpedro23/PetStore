<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 23/11/14
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="productos.Categoria" errorPage="" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>


<html>
<head>
    <title></title>
</head>
<body>
<%
    Categoria[] listaCategorias = (Categoria[]) request.getAttribute("listaCategorias");

    for (int i = 0; i < listaCategorias.length; i++) {
        out.println(listaCategorias[i].getNombreCategoria());
    }
%>

</body>
</html>
