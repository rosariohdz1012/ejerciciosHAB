package com.hackaboss.servlets.usuario;

import com.hackaboss.logica.controladora.ControladoraLogicaUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServ", urlPatterns = {"/Usuario"})
public class UsuarioServ extends HttpServlet {

    ControladoraLogicaUsuario conLoUsurs = new ControladoraLogicaUsuario();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (conLoUsurs.crear(nombre, email, password)) {
            response.sendRedirect(request.getContextPath());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
