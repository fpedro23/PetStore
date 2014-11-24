<%@ page import="shoppingcart.ShoppingCart" %>
<%@ page import="shoppingcart.ShoppingCart_item" %>
<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 24/11/14
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

    for (ShoppingCart_item shoppingCart_item : cart.shoppingCart_item.toArray()) {
        out.println(shoppingCart_item.getItem().getNombreItem());
    }


%>

<html>
<head>
    <title></title>
</head>
<body>
</body>
</html>
