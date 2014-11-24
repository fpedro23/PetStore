+<%--
+  Created by IntelliJ IDEA.
+  User: paoviquez
+  Date: 23/11/14
+  Time: 9:25
+  To change this template use File | Settings | File Templates.
+--%>
+
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
+<html>
+<head>
+ <title>Pet Store | Register</title>
+</head>
+<body>
+
+<form action="registerUser" ¡>
+ <label for="email">E-mail</label>
+ <input type="email" id="email" name="email"></br>
+ <label for="password">Contrase&ntilde;a</label>
+ <input type="text" id="password" name="password"></br>
+ <label for="direccion">Direcci&oacute;n</label>
+ <input type="text" id="direccion" name="direccion"></br>
+ <label for="numeroTelefono">Tel&eacute;fono</label>
+ <input type="text" id="numeroTelefono" name="numeroTelefono"></br>
+ <label for="mascotaFavorita">Mascota Favorita</label>
+ <input type="text" id="mascotaFavorita" name="mascotaFavorita"></br>
+ <input type="submit" value="Enviar Datos"/>
+</form>
+
+</body>
+</html>