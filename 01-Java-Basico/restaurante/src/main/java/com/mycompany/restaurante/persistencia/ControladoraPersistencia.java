package com.mycompany.restaurante.persistencia;

import com.mycompany.restaurante.logica.Platillo;
import com.mycompany.restaurante.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PlatilloJpaController platiJpa = new PlatilloJpaController();

    public void crearPlatillo(Platillo plat) {
        platiJpa.create(plat);
    }

    public List<Platillo> traerPlatillos() {
        return platiJpa.findPlatilloEntities();
    }

    public Platillo encontrarPlatillo(int id) {
        return platiJpa.findPlatillo(id);
    }

    public void editarPlatillo(Platillo plat) {
        try {
            platiJpa.edit(plat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPlatillo(int id) {
        try {
            platiJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
