
package tareaejer1gestinventariod1;

import logica.GestionInventario;
import logica.Producto;

public class TareaEjer1GestInventarioD1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionInventario inventario = new GestionInventario();
         
        inventario.agregarProducto(new Producto(1, "Azucar", 30, 20));
        inventario.agregarProducto(new Producto(2, "Leche", 27.50f, 15));
        inventario.agregarProducto(new Producto(3, "Coca", 43, 5));
        
        System.out.println(inventario.listarProductos());
    }
    
    
}
