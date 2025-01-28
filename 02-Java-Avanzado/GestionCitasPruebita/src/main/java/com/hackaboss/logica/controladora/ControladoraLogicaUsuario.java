package com.hackaboss.logica.controladora;

import com.hackaboss.logica.Usuario;
import com.hackaboss.persistencia.controladora.ControladoraPersistenciaUsuario;
import com.hackaboss.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraLogicaUsuario {

    ControladoraPersistenciaUsuario controlPersUsuario = new ControladoraPersistenciaUsuario();

    public Usuario buscarId(Long id) {
        return controlPersUsuario.buscarId(id);
    }

    public boolean validarUsuario(String email, String contraseña) {
        Usuario usuario = controlPersUsuario.buscarPorEmail(email);
        boolean esValido = false;
        if (usuario != null) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(contraseña)) {
                esValido = true;
            }
        }
        return esValido;
    }

    public boolean crear(String nombre, String email, String password) {
        boolean creado = false;
        Usuario usuar = new Usuario(nombre, email, password);
        try {
            controlPersUsuario.crear(usuar);
            creado = true;
        } catch (Exception e) {
        }
        return creado;
    }

    public List<Usuario> listar() {
        return controlPersUsuario.listar();
    }

    public void eliminar(Long id) {
        controlPersUsuario.eliminar(id);
    }

    public void editar(Usuario usuar) {
        controlPersUsuario.editar(usuar);
    }

}
