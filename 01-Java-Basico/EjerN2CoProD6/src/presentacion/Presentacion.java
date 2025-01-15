package presentacion;

import logica.GestionProductos;
import modelo.Producto;

public class Presentacion {

    GestionProductos gestiProductos = new GestionProductos();

    public Presentacion() {

    }

    public void llenarLista() {
        gestiProductos.agregarP(new Producto(1, "Televisor LED 55",
                "Samsung", "Televisor", 500, 650, 20));
        gestiProductos.agregarP(new Producto(2, "Smartphone Galaxy S21",
                "Samsung", "Teléfono", 700, 850, 15));
        gestiProductos.agregarP(new Producto(3, "Laptop Inspiron 15",
                "Dell", "Computadora", 600, 750, 10));
        gestiProductos.agregarP(new Producto(4, "Tablet iPad Air",
                "Apple", "Tablet", 400, 550, 25));
        gestiProductos.agregarP(new Producto(5, "Cámara EOS Rebel",
                " Canon", "Cámara", 300, 450, 12));
        gestiProductos.agregarP(new Producto(6, "Audífonos WH-1000XM4",
                "Sony", "Audífonos", 200, 350, 30));
        gestiProductos.agregarP(new Producto(7, "Smartwatch Series 6",
                "Apple", "Reloj Inteligente", 250, 400, 18));
        gestiProductos.agregarP(new Producto(8, "Consola PlayStation 5",
                "Sony", "Consola de Videojuegos", 450, 600, 8));
        gestiProductos.agregarP(new Producto(9, "Router Wi-Fi 6",
                "TP-Link", "Router", 100, 200, 40));
        gestiProductos.agregarP(new Producto(10, "Monitor 27\" 4K",
                "LG", "Monitor", 300, 450, 22));

    }
    
    public void imprimirLista(){
        System.out.println(gestiProductos.imprimir());        
    }
    
    public void mostrarProductoMayorPrecioVenta(){
        System.out.println(gestiProductos.getProductoMayorV());
    }
    public void mostrarProductoMenorCosto(){
        System.out.println(gestiProductos.getProductoMenorC());
    }
    
  public void borrarProducto(int i){
      
      try {
           if (gestiProductos.eliminarProductos(i)!= null) {
          System.out.println("Producto eliminado con exito");                    
      }else{
          System.out.println("El producto no fue encontrado");
      }
     
      } catch (IndexOutOfBoundsException e) {
          System.out.println("El indice ingresado esta fuera de rango.");
      }
     
  }
  
  public void actualizarStockProductoMayorCantidad(){
      gestiProductos.actualizarStockProducto();
  }
  

    
}
