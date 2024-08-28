<%-- 
    Document   : Resultado
    Created on : 27-ago-2024, 20:37:27
    Author     : Maricela Velasco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado del Registro</title>
    </head>
    <body>
        <h2><%= request.getAttribute("mensaje") %></h2>
    
    <% if (request.getAttribute("mensaje").equals("Registro exitoso.")) { %>
        <p>Nombre Completo: <%= request.getAttribute("nombreCompleto") %></p>
        <p>Email: <%= request.getAttribute("email") %></p>
    <% } %>
    
    <a href="index.html">Volver al formulario</a>
    </body>
</html>
