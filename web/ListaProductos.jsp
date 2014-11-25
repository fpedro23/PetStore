<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 23/11/14
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="productos.Producto" errorPage="" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Lista Productos</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.dropotron.min.js"></script>
    <script src="js/jquery.scrolly.min.js"></script>
    <script src="js/jquery.scrollgress.min.js"></script>
    <script src="js/skel.min.js"></script>
    <script src="js/skel-layers.min.js"></script>
    <script src="js/init.js"></script>
    <noscript>
        <link rel="stylesheet" href="css/skel.css" />
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="css/style-wide.css" />
        <link rel="stylesheet" href="css/style-noscript.css" />
    </noscript>
    <!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
    <!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
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
                    <!--
                    <li><a href="ListaCategorias.jsp">Lista Categor&iacute;s</a></li>
                    <li><a href="ListaItems.jsp">Lista Items</a></li>
                    <li><a href="ListaProductos.jsp">Lista Productos</a></li>
                    -->
                    <li><a href="RegisterNewUser.jsp">Registro</a></li>
                </ul>
            </li>
            <li><a href="Login.jsp" class="button special">Login</a></li>
        </ul>
    </nav>
</header>

<!-- Main -->
<article id="main">

    <header class="special container">
        <h2>Lista de <strong>Productos</strong></h2>
        <p>Gama de variedades con las que contamos en estos momentos.</p>
    </header>

    <!-- One -->
    <section class="wrapper style4 container">

        <!-- Content -->
        <div class="content">
            <section>
                <table style="width:100%" border="2">
                    <tr>
                        <%
                            Producto[] listaProductos = (Producto[]) request.getAttribute("listaProductos");

                            for (int i = 0; i < listaProductos.length; i++) {
                        %>
                        <td>
                            <%
                                out.println(listaProductos[i].getNombreProducto());
                            %>
                        </td>
                        <%
                            }
                        %>
                    </tr>
                </table>
                <a href="#" class="image featured"><img src="images/kitten.jpg" style="width: 100px;" alt="" /></a>
            </section>
        </div>

    </section>

</article>

<!-- Footer -->
<footer id="footer">
    <ul class="copyright">
        <li>&copy; ITESM</li><li>Pedro Contreras & Paola Viquez</li>
    </ul>
</footer>

</body>
</html>