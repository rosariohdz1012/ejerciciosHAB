package com.mycompany.ejer2consicrudd1.persistencia;

import com.mycompany.ejer2consicrudd1.logica.Producto;
import com.mycompany.ejer2consicrudd1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ProductoJpaController productoJPA = new ProductoJpaController();
   
    public void crearProducto(Producto prod){
        productoJPA.create(prod);
    }
    
    public void eliminarProducto(Long id){
        try {
            productoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger( ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
                   
        }
    }
    public void editarProducto (Producto prod){
        try {
            productoJPA.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
                    }
    public Producto buscarProducto(Long id){
        return productoJPA.findProducto(id);
    }
    
   public List<Producto> traerProductos(){
       return productoJPA.findProductoEntities();
   }
    
}
