<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 23/11/14
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="productos.Item" errorPage="" %>


<html>
<head>
    <title></title>
</head>
<body>

<%
    Item[] listaItems = (Item[]) request.getAttribute("listaItems");

    for (int i = 0; i < listaItems.length; i++) {
        out.println(listaItems[i].getNombreItem());
    }
%>

</body>
</html>
