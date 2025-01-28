<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PANEL</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <style>
            a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <section class="container">
            <h1>Panel Principal</h1>
            <div class="row">
                <div class="col-md-3">
                    <a href="<%=request.getContextPath()%>/tramite.jsp" class="mb-3">
                        <div class="card text-center bg-success text-white">
                            <div class="card-body">
                                <h3 class="display-6">Tramite
                                    <i class="bi bi-files"></i>
                                </h3>
                            </div>
                        </div>
                    </a>
                </div>

                <div class="col-md-3">
                    <a href="<%=request.getContextPath()%>/ciudadano.jsp" class="mb-3">
                        <div class="card text-center bg-success text-white">
                            <div class="card-body">
                                <h3 class="display-6"> Ciudadano<i class="bi bi-person"></i> </h3>
                            </div>
                        </div>
                    </a>
                </div>

                <div class="col-md-3">
                    <a href="<%=request.getContextPath()%>/cita.jsp" class="mb-3">
                        <div class="card text-center bg-success text-white">
                            <div class="card-body">
                                <h3 class="display-6"> Cita
                                    <i class="bi bi-calendar-event"></i> 
                                </h3>

                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </section>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
