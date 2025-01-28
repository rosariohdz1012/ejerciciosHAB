package com.hackaboss.servlets.tramite;

import com.hackaboss.logica.Tramite;
import com.hackaboss.logica.controladora.ControladoraLogicaTramite;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "TramiteServlet", urlPatterns = {"/Tramite"})
public class TramiteServ extends HttpServlet {

    ControladoraLogicaTramite contrologicaTraSv = new ControladoraLogicaTramite();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {//OBTENER LA INFORMACION
        //response.sendRedirect(request.getContextPath()+"/");
        String accion = Optional.ofNullable(request.getParameter("accion")).orElse("listar");
        switch (accion) {
            case "listar":
                this.listarTramites(request, response);
            default:
                this.listarTramites(request, response);
        }
    }

    private void listarTramites(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Tramite> tramite = contrologicaTraSv.listar();
        System.out.println("tramite:" + tramite);
        //obtener la sesion
        HttpSession sesion = request.getSession();
        sesion.setAttribute("tramite", tramite);
        sesion.setAttribute("tramite", tramite.size());
        //respuesta jsp de tramites
        request.getRequestDispatcher("tramite.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
