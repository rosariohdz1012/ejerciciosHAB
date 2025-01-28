package com.hackaboss.servlets;

import com.hackaboss.logica.controladora.ControladoraLogicaUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServ", urlPatterns = {"/Login"})
public class LoginServ extends HttpServlet {
    
     ControladoraLogicaUsuario conLoUsurs = new ControladoraLogicaUsuario();
     

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(conLoUsurs.validarUsuario(email, password)){
            response.sendRedirect("panel.jsp");
        }else {
            response.sendRedirect("login.jsp");
                    
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
