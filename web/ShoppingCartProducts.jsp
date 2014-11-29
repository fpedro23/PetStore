<%@ page import="shoppingcart.ShoppingCart" %>
<%@ page import="shoppingcart.ShoppingCart_item" %>
<%@ page import="login.Usuario" %>
<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 24/11/14
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Item detallado</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <!--[if lte IE 8]>
    <script src="css/ie/html5shiv.js"></script><![endif]-->
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.dropotron.min.js"></script>
    <script src="js/jquery.scrolly.min.js"></script>
    <script src="js/jquery.scrollgress.min.js"></script>
    <script src="js/skel.min.js"></script>
    <script src="js/skel-layers.min.js"></script>
    <script src="js/init.js"></script>
    <noscript>
        <link rel="stylesheet" href="css/skel.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/style-wide.css"/>
        <link rel="stylesheet" href="css/style-noscript.css"/>
    </noscript>
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="css/ie/v8.css"/><![endif]-->
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="css/ie/v9.css"/><![endif]-->
</head>
<body class="no-sidebar">

<!-- Header -->
<header id="header">
    <h1 id="logo"><a href="index.jsp">Pet <span>Store</span></a></h1>
    <nav id="nav">
        <ul>
            <li class="current"><a href="index.jsp">Bienvenido</a></li>
            <li class="submenu">
                <a href="">Men&uacute;</a>
                <ul>
                    <li><a href="RegisterNewUser.jsp">Registro</a></li>
                </ul>
            </li>
            <li class="current"><a href="ShoppingCartProducts.jsp">Carrito de Compras</a></li>
            <li><a href="Login.jsp" class="button special">Login</a></li>
        </ul>
    </nav>
</header>

<!-- Main -->
<article id="main">

    <header class="special container">
        <span class="icon fa-mobile"></span>

        <h2>Carrito de <strong>Compras</strong></h2>

        <p>Estas son tus compras.</p>
    </header>

    <!-- One -->
    <section class="wrapper style4 container">

        <!-- Content -->
        <div class="content">
            <%
                ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
                Usuario usuario = (Usuario) session.getAttribute("nombreUsuario");
            %>

            <p>
                Nombre de Usuario: <%out.println(usuario.getEmail());%>
            </p>

            <p>
                Direccion : <%out.println(usuario.getDireccion());%>
            </p>

            <p>
                Telefono : <%out.println(usuario.getNumeroTelefono());%>
            </p>

            <p>
                Mascota Favorita: <%out.println(usuario.getMascotaFavorita());%>
            </p>

            <%
                for (ShoppingCart_item shoppingCart_item : cart.shoppingCart_item.toArray()) {
            %>
            <p>
                Nombre de item: <%out.println(shoppingCart_item.getItem().getNombreItem());%>
            </p>

            <p>
                Cantidad : <%out.println(shoppingCart_item.getCantidad());%>
            </p>

            <p>
                Precio item: <%out.println(shoppingCart_item.getItem().getPrecio());%>
            </p>

            <p>
                Total Por Item : <%
                out.println(shoppingCart_item.getCantidad() * shoppingCart_item.getItem().getPrecio());

            %>
            </p>

            <%
                }
            %>

            <p>
                Total Orden: <%
                int subtotal = 0;
                for (ShoppingCart_item shoppingCart_item : cart.shoppingCart_item.toArray()) {
                    subtotal = subtotal + shoppingCart_item.getItem().getPrecio() * shoppingCart_item.getCantidad();
                }


                out.println("" + subtotal);

            %>
            </p>

            <form action="placeOrder">
                <ul class="buttons">
                    <li><input type="submit" value="Place Order!"/></li>
                </ul>
            </form>
        </div>

    </section>

</article>

<!-- Footer -->
<footer id="footer">
    <ul class="copyright">
        <li>&copy; ITESM</li>
        <li>Pedro Contreras & Paola Viquez</li>
    </ul>
</footer>

</body>
</html>