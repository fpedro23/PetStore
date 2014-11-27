<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 22/11/14
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Pet Store | Login</title>
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
<body class="index">

<!-- Header -->
<header id="header" class="alt">
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

<!-- Banner -->
<section id="banner">
    <div class="inner">

        <header>
            <h2>Login</h2>
        </header>
        <form action="doLogin" name="login" id="login">
            <p>
                <label for="email">Usuario</label>
                <input type="text" id="email" name="email"/>
                <label for="password">Contrase&ntilde;a</label>
                <input type="password" id="password" name="password"/>
            </p>
            <footer>
                <ul class="buttons vertical">
                    <li><input type="submit" value="Iniciar Sesion"/></li>
                </ul>
            </footer>
        </form>
    </div>

</section>

<!-- Footer -->
<footer id="footer">
    <ul class="copyright">
        <li>&copy; ITESM</li>
        <li>Pedro Contreras & Paola Viquez</li>
    </ul>
</footer>

</body>
</html>