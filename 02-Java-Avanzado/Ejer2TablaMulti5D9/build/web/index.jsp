<%-- 
    Document   : index
    Created on : 13 ene. 2025, 16:56:04
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
        <%for (int i = 1; i <= 10; i++) {%> 
        <h2> 5 x <%=i%> = <%=(5 * i)%></h2> 
        <%}%> 
    </body>
</html>
