package com.hackaboss.logica.controladora;

import com.hackaboss.logica.Ciudadano;
import com.hackaboss.persistencia.controladora.ControladoraPersistenciaCiudadano;
import java.util.List;

public class ControladoraLogicaCiudadano {

    ControladoraPersistenciaCiudadano controlPersisCiudadano = new ControladoraPersistenciaCiudadano();

    public Ciudadano buscar(Long id) {
        return controlPersisCiudadano.buscar(id);
    }

    public void crear(Ciudadano ciu) {
        controlPersisCiudadano.crear(ciu);
    }

    public List<Ciudadano> listar() {
        return controlPersisCiudadano.listar();
    }

    public void eliminar(Long id) {
        controlPersisCiudadano.eliminar(id);
    }

    public void editar(Ciudadano ciu) {
        controlPersisCiudadano.editar(ciu);
    }
}
