<%--
  Created by IntelliJ IDEA.
  User: Pedro
  Date: 22/11/14
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Pet Store</title>
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
            <h2>PET STORE</h2>
        </header>
        <p>Todo para tu <strong>Mascota</strong>
            <br/>
            encuentra la mejor
            <br/>
            opci&oacute;n aqu&iacute;
        </p>

    </div>

</section>

<!-- Main -->
<article id="main">

    <!-- Options -->
    <section class="wrapper style1 container special">
        <div class="row">
            <div class="4u 12u(2)">

                <section>
                    <span class="icon featured fa-check"></span>
                    <header>
                        <h3><a href="#categoriesbox">Categor&iacute;as</a></h3>
                    </header>
                    <p>B&uacute;squeda por categor&iacute;a. Encuentra todo lo que necesitas para tu amigo en casa.</p>
                </section>

            </div>
            <div class="4u 12u(2)">

                <section>
                    <span class="icon featured fa-check"></span>
                    <header>
                        <h3><a href="#productsbox">Productos</a></h3>
                    </header>
                    <p>B&uacute;squeda por categor&iacute;a. Si buscas algo en especifico, aqu&iacute; lo vas a
                        encontrar.</p>
                </section>

            </div>
            <div class="4u 12u(2)">

                <section>
                    <span class="icon featured fa-check"></span>
                    <header>
                        <h3><a href="#itemsbox">Items</a></h3>
                    </header>
                    <p>B&uacute;squeda por categor&iacute;a. Personaliza tu producto a trav&eacute;s de esta liga</p>
                </section>

            </div>

        </div>
    </section>

    <!-- Categories -->
    <section class="wrapper style4 container" id="categoriesbox">

        <div class="row 150%">
            <div class="4u 12u(2)">

                <!-- Sidebar -->
                <div class="sidebar">
                    <section>
                        <header>
                            <h3>Categor&iacute;as</h3>
                        </header>
                        <p>
                            Contamos con una gran variedad de categor&iacute;as de art&iacute;culos, para la comodidad y
                            satisfacci&oacute;n de su mascota.
                        </p>

                        <form action="listCategories" id="listCategories" name="listCategories">
                            <footer>
                                <ul class="buttons">
                                    <li><input type="submit" value="Lista Categor&iacute;as"/></li>
                                </ul>
                            </footer>
                        </form>
                    </section>
                </div>

            </div>
            <div class="8u 12u(2) important(2)">

                <!-- Content -->
                <div class="content">
                    <section>
                        <a href="#" class="image featured"><img src="images/goldendog.jpg" alt=""/></a>
                    </section>
                </div>

            </div>
        </div>
    </section>

    <!-- Productos -->
    <section class="wrapper style4 container" id="productsbox">

        <div class="row 150%">
            <div class="8u 12u(2)">

                <!-- Content -->
                <div class="content">
                    <section>
                        <a href="#" class="image featured"><img src="images/pericos.jpg" alt=""/></a>
                    </section>
                </div>

            </div>
            <div class="4u 12u(2)">

                <!-- Sidebar -->
                <div class="sidebar">
                    <section>
                        <header>
                            <h3>Productos</h3>
                        </header>
                        <p>&iquest;Busca un producto en espec&iacute;fico? Utilice el siguiente buscador y lo
                            encontrar&aacute;</p>

                        <form action="findProductByName" id="findProductByName" name="findProductByName">
                            <p><input type="text" id="nombreProducto" name="nombreProducto" placeholder="Producto"/></p>
                            <footer>
                                <ul class="buttons">
                                    <li><input type="submit" value="Busca Producto"/></li>
                                </ul>
                            </footer>
                        </form>
                    </section>

                </div>

            </div>
        </div>
    </section>

    <!-- Items -->
    <section class="wrapper style4 container" id="itemsbox">

        <div class="row 150%">
            <div class="4u 12u(2)">

                <!-- Sidebar -->
                <div class="sidebar">
                    <section>
                        <header>
                            <h3>Items</h3>
                        </header>
                        <p>
                            Personalice su producto. D&iacute;ganos que es lo que busca de que clase y lo encontraremos
                            para usted.
                        </p>

                        <form action="findItemByID" id="findItemByID" name="findItemByID">
                            <p><input type="text" name="idItem" placeholder="Item"/></p>
                            <footer>
                                <ul class="buttons">
                                    <li><input type="submit" value="Busca Item"/></li>
                                </ul>
                            </footer>
                        </form>
                    </section>
                </div>

            </div>
            <div class="8u 12u(2) important(2)">

                <!-- Content -->
                <div class="content">
                    <section>
                        <a href="#" class="image featured"><img src="images/gatos1.jpg" alt=""/></a>
                    </section>
                </div>

            </div>
        </div>
    </section>


</article>

<!-- CTA -->
<section id="cta">

    <header>
        <h2>&iquest;Listo para realizar una <strong>compra</strong>?</h2>

        <p>Llene un sencillo formulario para poder participar con nosotros.</p>
    </header>
    <footer>
        <ul class="buttons">
            <li><a href="RegisterNewUser.jsp" class="button special">Reg&iacute;strate aqu&iacute;</a></li>
        </ul>
    </footer>

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