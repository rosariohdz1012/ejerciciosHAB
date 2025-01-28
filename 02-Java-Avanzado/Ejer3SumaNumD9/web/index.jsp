<%-- 
    Document   : index
    Created on : 13 ene. 2025, 17:00:21
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
       
        <h1>Mostrar la suma de numeros</h1> 
        <%int con=0;%>
        <%for (int i = 1; i <= 10; i++) {%> 
        <%con += i;%>
        <h2><%=con%></h2> 
        <%}%> 
    </body>
</html>
