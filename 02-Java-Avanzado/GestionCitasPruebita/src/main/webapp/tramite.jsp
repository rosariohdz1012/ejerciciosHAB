<%@page import="java.util.ArrayList"%>
<%@page import="com.hackaboss.logica.Tramite"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO TRAMITE</title>
        -<!-- css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <!-- icono -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    </head>
    <body>
       
    <section id="tramite">
        <div class="container">
            <div class="row">
                <div class="col-md-20" >
                    <div class="card">
                        <div class="card-header">
                            <h4>Listado de Tramites</h4>
                        </div>
                        <table class="table table-striped">
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Descripcion</th>
                            </tr>
                            <tbody>
                                <%
                                    List<Tramite> listaTramites = (ArrayList<Tramite>) request.getAttribute("listaTramites");
                                    if (listaTramites != null) {
                                        //traer lista de Personas
                                        for (Tramite t : listaTramites) {%>
                                <tr>
                                    <td><%=t.getNombre()%></td>
                                    <td><%=t.getDescripcionTra()%></td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                            <%}%>
                        </table>
                    </div>

                </div>
            </div>
        </div>
    </section>

</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
