package ejer2gesreservasd5;

import logica.PrecioReserva;
import logica.Reserva;

public class Ejer2GesReservasD5 {

    public static void main(String[] args) {

        //Precio original
        double precioBase = 1000;

        Reserva reser = new Reserva();

        //Un descuento del 10% para clientes con membresía.
        PrecioReserva clienteMembresia = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioOrigin) {
                return precioOrigin - (precioOrigin * 0.90);//10% de Descuento
            }

        };
        //Un descuento del 20% para reservas en temporada baja.
        PrecioReserva reservaBajas = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioOrigin) {
                return precioOrigin - (precioOrigin * 0.80);//20% de Descuento
            }

        };
        //Un precio fijo para reservas de última hora (sin descuento).
        PrecioReserva ultimaHora = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioOrigin) {
                return precioOrigin;//sin descuento
            }

        };

        reser.realizarReserva(precioBase, clienteMembresia);
        reser.realizarReserva(precioBase, reservaBajas);
        reser.realizarReserva(precioBase, ultimaHora);
    }

}
