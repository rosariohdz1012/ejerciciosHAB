package Presentacion;

import java.time.LocalDate;
import java.util.Scanner;
import logica.Reservacion;
import logica.Usuario;
import logica.Vuelo;
import logica.excepciones.ReservacionExcepcion;
import logica.excepciones.ValidarReservacion;

public class Presentacion {

    Vuelo vuelo;
    Usuario usuario;
    Scanner teclado;
    ValidarReservacion validR;
    Reservacion reserva;

    public Presentacion() {
        vuelo = new Vuelo();
        usuario = new Usuario();
        teclado = new Scanner(System.in);
        validR = new ValidarReservacion();
        reserva = new Reservacion();

    }

    public void ingresarNombre() {
        //Validar destino
        boolean nombreValido = true;
        String nombre;
        while (nombreValido) {
            try {
                System.out.println("Digite su nombre");
                nombre = teclado.nextLine();
                validR.validar(nombre);
                usuario.setNombre(nombre);
                nombreValido = false;
            } catch (ReservacionExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void ingresarDestimo() {
        //Validar destino
        boolean destinoValido = true;
        String destino;
        while (destinoValido) {
            try {
                System.out.println("Digite el destino");
                destino = teclado.nextLine();
                validR.validar(destino);
                usuario.setDestino(destino);
                destinoValido = false;
            } catch (ReservacionExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void ingresarFecha() {
        //Validar fecha
        boolean fechaValida = true;
        int dia, mes;
        while (fechaValida) {
            try {
                System.out.println("Digitar dia");
                dia = Integer.parseInt(teclado.nextLine());
                System.out.println("Digitar mes");
                mes = Integer.parseInt(teclado.nextLine());
                usuario.setFechaViaje(LocalDate.of(LocalDate.now().getYear(), mes, dia));

                fechaValida = false;
            } catch (NumberFormatException ex) {
                System.out.println("Los campos deben ser numericos para la fecha");
            }
        }
    }

    public void ingresarAsientos() {

        boolean asientosValidos = true;
        int asientos;

        while (asientosValidos) {
            try {
                System.out.println("Digite el numero de asientos");
                asientos = Integer.parseInt(teclado.nextLine());
                validR.validarAsientos(asientos, vuelo.getTotalAsientos());
                usuario.setNumAsientosDeseados(asientos);
                asientosValidos = false;
            } catch (NumberFormatException ex) {
                System.out.println("El campo debe ser numerico para el numero de asientos ");
            } catch (ReservacionExcepcion ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void realizarReservacion() {//asinar y obtener los datos
        reserva.setUsuario(usuario);
        reserva.setVuelo(vuelo);
        reserva.reservar();
    }
    public void inicarAplicacion() {//Ingresar todas las acciones
        ingresarNombre();
        ingresarDestimo();
        ingresarFecha();
        ingresarAsientos();
        System.out.println("Asientos disponibles antes de la reservacion son " + vuelo + "\n");
        realizarReservacion();
        imprimirReservacion();

    }
    public void imprimirReservacion() {
        System.out.println(usuario);
        System.out.println("Asientos disponibles despues de la reservacion son " + vuelo);
    }

}
