package logica;

import java.util.ArrayList;
import java.util.List;

public class GestionInventario {
    
    List<Producto> listProductos;

    public GestionInventario() {
        listProductos = new ArrayList<>();
    }
    
    public boolean agregarProducto(Producto p){
        return listProductos.add(p);
    }
    
    public String listarProductos(){
        StringBuilder productos = new StringBuilder();
        
        for(Producto p : listProductos){
            productos.append(p);
        }
        
        return productos.toString();        
        
    }
    
    

    
    
}
