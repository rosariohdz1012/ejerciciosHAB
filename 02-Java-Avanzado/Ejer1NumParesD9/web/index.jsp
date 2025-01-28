<%-- 
    Document   : NumerosPares
    Created on : 13 ene. 2025, 16:32:47
    Author     : IngRosario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Generador de números pares</h1>
        <%int con = 0;%>
        <%for (int i = 0; i < 10; i++) { %>
        <% con += 2;%>
        <h2>Numero par: <%=con%></h2>
        <%}%>
    </body>
</html>
