package com.mycompany.ejer2consicrudd1.logica;

import com.mycompany.ejer2consicrudd1.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraPrincipalProducto {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public List<Producto> listar() {
       
        return  controlPersis.traerProductos();
    }
    
    public void crear(Producto prod){
        controlPersis.crearProducto(prod);
    }
    public void buscar(Producto prod){
        
    }
}
