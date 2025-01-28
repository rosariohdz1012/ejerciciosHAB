<%-- 
    Document   : index
    Created on : 13 ene. 2025, 15:54:47
    Author     : IngRosario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer JSP</title>
    </head>
    <body>
        <%String nombre = " Luisina";%>
        <%for(int i= 0;i<5;i++){%>
        <h1>Hello Desde JSP!<%=nombre%></h1>
        <%}%>
    </body>
</html>
