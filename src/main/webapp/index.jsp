<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background-image: url('imagenes/dance.gif');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed; /* Esto mantiene la imagen de fondo fija mientras se desplaza el contenido */
        }
    </style>

</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form method="get" action="/holamundoGetPost">
    Nombre: <input type="text" name="nombre" >
    <button type="submit">DoGet</button>
</form> <br>
<form method="post" action=“../servlet/holamundoGetPost">
    Nombre: <input type="text" name="nombre"/>
    <button type="submit">DoPost</button>
<br/>
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>