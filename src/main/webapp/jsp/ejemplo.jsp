<%--
  Created by IntelliJ IDEA.
  User: Mikel Rivera
  Date: 01/03/2024
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Saludo JSP</title>
</head>
<body>
    <h2>¡BIenvenido a la pagina de saludo!</h2>
    <%-- Obtenemos el nombre del parametro de la solicitud --%>
    <% String nombre = request.getParameter("nombre");
        // Veeificamos si el nombre es nulo o vacio
        if (nombre != null && !nombre.isEmpty()) {
    %>
            <p>Hola,<%=nombre%></p>

    <% } else { %>
            <p>Por favor, introduce tu nombre</p>

    <% } %>
    <form action="ejemplo.jsp" method="get">
        <label for="nombre">Nombre:</label>
        <input type="text" id=nombre name="nombre">
        <input type="submit" value="Saludar">
    </form>
</body>
</html>
