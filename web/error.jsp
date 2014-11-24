<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 22/11/14
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title></title>
</head>
<body>
<%
    String mensajeResultado = (String) request.getAttribute("mensajeResultado");

    out.println(mensajeResultado);
%>
</body>
</html>
