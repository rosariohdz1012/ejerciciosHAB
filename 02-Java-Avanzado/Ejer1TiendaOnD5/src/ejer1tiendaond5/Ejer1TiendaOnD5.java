package ejer1tiendaond5;

import logica.Compra;
import logica.Descuento;

public class Ejer1TiendaOnD5 {

    public static void main(String[] args) {
        //Precio Original
        //Se puede hacer con scanner y todo como corresponde
        double precioOriginal = 350;

        //Creo una instancia de la clase Producto
        Compra compra = new Compra();

        //Clase anonima para el nuevo cliente 5% de descuento
        Descuento clienteNuevo = new Descuento() {
            @Override
            public double aplicarDescuento(double precioOriginal) {
                return precioOriginal - (precioOriginal * 0.05);
                //return precioOriginal*0.95;
            }

        };

        //Clase anonima para el nuevo cliente 10% de descuento
        Descuento clienteFrecuente = new Descuento() {
            @Override
            public double aplicarDescuento(double precioOriginal) {
                return precioOriginal - (precioOriginal * 0.10);
                //return precioOriginal*0.90;
            }

        };
        //Clase anonima para el nuevo cliente 20% de descuento
        Descuento clienteVIP = new Descuento() {
            @Override
            public double aplicarDescuento(double precioOriginal) {
                return precioOriginal - (precioOriginal * 0.20);
                //return precioOriginal*0.80;
            }

        };
        compra.mostrarPrecioFinal(precioOriginal, clienteNuevo);
          compra.mostrarPrecioFinal(precioOriginal, clienteFrecuente);
            compra.mostrarPrecioFinal(precioOriginal, clienteVIP);
    }

}
