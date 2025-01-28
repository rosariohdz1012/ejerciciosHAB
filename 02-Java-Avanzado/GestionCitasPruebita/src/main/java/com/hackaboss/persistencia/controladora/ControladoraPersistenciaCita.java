package com.hackaboss.persistencia.controladora;

import com.hackaboss.logica.Cita;
import com.hackaboss.persistencia.CitaJpaController;
import com.hackaboss.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistenciaCita {

    CitaJpaController citaJpa = new CitaJpaController();

    public Cita buscar(Long id) {
        return citaJpa.findCita(id);
    }

    public void crear(Cita cit) {
        citaJpa.create(cit);
    }

    public List<Cita> listar() {
        return citaJpa.findCitaEntities();
    }

    public void eliminar(Long id) {
        try {
            citaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistenciaCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Cita cit) {
        try {
            citaJpa.edit(cit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaCita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
