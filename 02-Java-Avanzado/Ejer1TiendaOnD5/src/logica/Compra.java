
package logica;

public class Compra {
    
    public void mostrarPrecioFinal(Double precioOriginal,Descuento des){
        double precioFinal = des.aplicarDescuento(precioOriginal);
        System.out.println("El precio final con descuento es de: " + precioFinal);
    }
    
}
