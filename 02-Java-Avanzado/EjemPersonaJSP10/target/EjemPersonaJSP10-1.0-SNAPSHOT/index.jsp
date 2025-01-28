<%-- 
    Document   : index
    Created on : 20 ene 2025, 0:44:46
    Author     : IngRosario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.hackaboss.logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Personas</title>
        <!-- estilo de la web -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>

        <div class="container mt-4"> 
            <h1>Formulario alta de personas</h1>
            <form action="PersonaSv" method="POST">

                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>

                <div class="form-group">
                    <label for="apellido">Apellido:</label>
                    <input type="text" class="form-control" id="apellido" name="apellido">
                </div>

                <div class="form-group">
                    <label for="Telefono">Telefono:</label>
                    <input type="text" class="form-control" id="telefono" name="telefono">
                </div>

                <button type="submit" class="btn btn-primary" >Enviar</button>

            </form>
            <!-- Busqueda -->
            <h1 class="mt-4">Busqueda</h1>
            <form action="PersonaSv" method="GET">
                <div class="form-group">
                    <label for="busquedaApellido">Buscar por Apellido</label>
                    <input type="text" class="form-group" id="busquedaApellido" name="busquedaApellido">
                </div>

                <button type="submit" class="btn btn-primary">Buscar</button>
            </form>

            <!-- Resueltados de la busqueda -->
            <div class="results-table mt-4">

                <h3>Resultados</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Apellido:</th>
                            <th>Telefono</th>
                        </tr>
                    </thead>
                    <tbody>

                        <%
                            List<Persona> listaPersonas = (ArrayList<Persona>) request.getAttribute("listaPersonas");
                            if (listaPersonas != null) {
                                //traer lista de Personas
                                for (Persona pers : listaPersonas) {%>
                        <tr>
                            <td><%=pers.getNombre()%></td>
                            <td><%=pers.getApellido()%></td>
                            <td><%=pers.getTelefono()%></td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                    <%}%>
                </table>
            </div>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>  

    </body>
</html>
