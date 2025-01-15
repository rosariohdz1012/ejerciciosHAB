package com.mycompany.restaurante.logica;

import com.mycompany.restaurante.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillo plat) {
        controlPersis.crearPlatillo(plat);
        
    }

    public List<Platillo> traerPlatillos() {
               return controlPersis.traerPlatillos();
    }
    
    public Platillo encontrarPlatillo(int id){
        return controlPersis.encontrarPlatillo(id);
    }
    
    public boolean editarPlatillo(Platillo plat){
        controlPersis.editarPlatillo(plat);
        return true;
    }
    
    public void eliminarPlatillo(int id){
        controlPersis.eliminarPlatillo(id);
    }
    
    
}
