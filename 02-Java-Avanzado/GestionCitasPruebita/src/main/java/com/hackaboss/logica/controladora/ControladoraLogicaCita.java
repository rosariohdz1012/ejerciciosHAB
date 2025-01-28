package com.hackaboss.logica.controladora;

import com.hackaboss.logica.Cita;
import com.hackaboss.persistencia.controladora.ControladoraPersistenciaCita;
import java.util.List;

public class ControladoraLogicaCita {

    ControladoraPersistenciaCita controlPersisCita = new ControladoraPersistenciaCita();

    public Cita buscar(Long id) {
        return controlPersisCita.buscar(id);
    }

    public void crear(Cita cit) {
        controlPersisCita.crear(cit);
    }

    public List<Cita> listar() {
        return controlPersisCita.listar();
    }

    public void eliminar(Long id) {
        controlPersisCita.eliminar(id);
    }

    public void editar(Cita cit) {
        controlPersisCita.editar(cit);
    }
}
