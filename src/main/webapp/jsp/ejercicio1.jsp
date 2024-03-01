<%@ page import="java.util.Enumeration" %><%--
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
    <h1>Cabeceras de solicitud HTTP</h1>
    <table border=\"1\">
    <tr>
        <th>Nombre</th>
        <th>Valor</th>
    </tr>
        <%-- Obtenemos las cabeceras de la solicitud HTTP --%>
        <%Enumeration<String> headerNames = request.getHeaderNames();
    while(headerNames.hasMoreElements()) {%>
        <tr>
            <td><%=headerNames.nextElement()%></td>
            <td><%=request.getHeader(headerNames.nextElement())%></td>
        </tr>
    <%}%>
</body>
</html>
