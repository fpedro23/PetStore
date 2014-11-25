+<%--
+  Created by IntelliJ IDEA.
+  User: paoviquez
+  Date: 23/11/14
+  Time: 9:25
+  To change this template use File | Settings | File Templates.
+--%>
+
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Pet Store | Registro</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <!--[if lte IE 8]><script src="../css/ie/html5shiv.js"></script><![endif]-->
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
<body class="contact">

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
        <span class="icon fa-envelope"></span>
        <h2>Reg&iacute;strate con nosotros</h2>
        <p>Llene el siguiente formulario para unirte a nuestra comunidad.</p>
    </header>

    <!-- One -->
    <section class="wrapper style4 special container 75%">

        <!-- Content -->
        <div class="content">
            <form action="registerUser" name="registerUser" id="registerUser">
                <div class="row 50%">
                    <div class="6u 12u(3)">
                        <input type="email" id="email" name="email" placeholder="E-mail" />
                    </div>
                    <div class="6u 12u(3)">
                        <input type="text" id="password" name="password" placeholder="Contrase&ntilde;a" />
                    </div>
                </div>
                <div class="row 50%">
                    <div class="12u">
                        <input type="text" id="direccion" name="direccion" placeholder="Direcci&oacute;n" />
                    </div>
                </div>
                <div class="row 50%">
                    <div class="12u">
                        <input type="text" id="numeroTelefono" name="numeroTelefono" placeholder="Tel&eacute;fono" />
                    </div>
                </div>
                <div class="row 50%">
                    <div class="12u">
                        <input type="text" id="mascotaFavorita" name="mascotaFavorita" placeholder="Mascota Favorita" />
                    </div>
                </div>
                <div class="row">
                    <div class="12u">
                        <ul class="buttons">
                            <li><input type="submit" class="special" value="Enviar Datos" /></li>
                        </ul>
                    </div>
                </div>
            </form>
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