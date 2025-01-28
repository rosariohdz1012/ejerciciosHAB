package com.hackaboss.servlets;

import com.hackaboss.logica.ControladoraLogica;
import com.hackaboss.logica.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PersonaSv", urlPatterns = {"/PersonaSv"})
public class PersonaSv extends HttpServlet {

    ControladoraLogica contrologic = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String busquedaApellido = request.getParameter("busquedaApellido");
        /*opcion 1
paso este dato ala logica, la logica le pide TODOS los datos a la persistencia/BD y la 
logica se encarga de filtrar*/
        ArrayList<Persona> listaPersonas = contrologic.buscarPorApellido(busquedaApellido);
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaPersonas", listaPersonas);
        
        response.sendRedirect("index.jsp");
        
        
                /*opcion 2
paso este dato ala logica le ide a la persistencia que traiga SOLO LOS DATOS  */
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {//request solicitud
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        contrologic.crearPersona(nombre, apellido, telefono);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
