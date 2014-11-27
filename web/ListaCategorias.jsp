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

<!DOCTYPE HTML>
<html>
<head>
    <title>Lista Categorias</title>
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
        <h2>Lista de <strong>Categor&iacute;as</strong></h2>
        <p>Gama de variedades con las que contamos en estos momentos.</p>
    </header>

    <!-- One -->
    <section class="wrapper style4 container" id="itemsbox">

        <div class="row 150%">
            <div class="4u 12u(2)">

                <!-- Sidebar -->
                <div class="sidebar">
                    <section>
                        <table style="width:100%" border="2">
                            <tr>
                                <%
                                    Categoria[] listaCategorias = (Categoria[]) request.getAttribute("listaCategorias");

                                    for (int i = 0; i < listaCategorias.length; i++) {
                                %>
                                <p>
                                <form action="listProductsFromCategory" name="listProductsFromCategory">
                                    <input type="hidden" name="nombreCategoria" value="<%
                                     String nombreCategoria = listaCategorias[i].getNombreCategoria();
                                     System.out.println(nombreCategoria);
                                     nombreCategoria.replaceAll("[\n\r]", "");
                                     System.out.println(nombreCategoria);
                                     out.print(nombreCategoria);

                                     %>" />
                                    <ul class="buttons">
                                        <li> <input type="submit" value="<%out.println(listaCategorias[i].getNombreCategoria()); %>"/> </li>
                                    </ul>
                                </form>
                                </p>
                                <%
                                    }
                                %>
                            </tr>
                        </table>
                    </section>
                </div>

            </div>
            <div class="8u 12u(2) important(2)">

                <!-- Content -->
                <div class="content">
                    <section>
                        <a href="#" class="image featured"><img src="images/peces.jpg" alt="" /></a>
                    </section>
                </div>

            </div>
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