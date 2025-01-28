package presentacion;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Excepciones.MontoInvalidoException;
import logica.Excepciones.Validaciones;

public class Presentacion {

    Scanner teclado;
    Validaciones validar;
    Cliente cliente;

    public Presentacion() {
        teclado = new Scanner(System.in);
        validar = new Validaciones();
        cliente = new Cliente();
    }

    public void ingresarNombre() {
        boolean nombreValido = true;
        String nombreTar = " ";
        while (nombreValido) {
            try {
                System.out.println("Digite el nombre del usuario");
                nombreTar = teclado.nextLine();
                validar.nombreVacio(nombreTar);
                cliente.setNombre(nombreTar);
                nombreValido = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void ingresarNumTarjeta() {
        boolean tarjetaValida = true;
        String numeroTarjeta;
        while (tarjetaValida) {
            try {
                System.out.println("Digite el numero de la tarjeta");
                numeroTarjeta = teclado.nextLine();
                validar.validadNumTarjeta(numeroTarjeta);
                cliente.setNumTarjeta(numeroTarjeta);
                tarjetaValida = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void ingresarMonto() {
        boolean montoValido = true;
        double montoTar = 0.0;
        while (montoValido) {
            try {
                System.out.println("Digite el monto a depositar de la tarjeta");
                montoTar = teclado.nextDouble();
                validar.montoNegativoCero(montoTar);
                cliente.setMonto(montoTar);
                montoValido = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (MontoInvalidoException ex) {
                Logger.getLogger(Presentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void imprimirReservacion() {
        System.out.println(cliente);
       
    }


    public void realizarCompra() {
        cliente.getNumTarjeta();
        cliente.getNombre();
        cliente.getMonto();
        cliente.toString();
   

    }

    public void iniarApp() {
        ingresarNumTarjeta();
        ingresarNombre();
        ingresarMonto();
        realizarCompra();
        imprimirReservacion();
    }

}
