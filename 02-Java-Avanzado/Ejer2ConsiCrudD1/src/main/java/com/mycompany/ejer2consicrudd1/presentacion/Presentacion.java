package com.mycompany.ejer2consicrudd1.presentacion;

import com.mycompany.ejer2consicrudd1.logica.Producto;
import com.mycompany.ejer2consicrudd1.logica.excepciones.NombreInvalidoException;
import com.mycompany.ejer2consicrudd1.logica.excepciones.PrecioInvalidoException;
import com.mycompany.ejer2consicrudd1.logica.excepciones.StockInvalidoException;
import com.mycompany.ejer2consicrudd1.logica.excepciones.Validaciones;
import java.util.Scanner;

public class Presentacion {

    Scanner teclado;
    Producto producto;
    Validaciones validaci;
    boolean bandera = true;
    int opcion = 0;
    String menu;

    public Presentacion() {
        teclado = new Scanner(System.in);
        producto = new Producto();
        validaci = new Validaciones();

    }

    public void ingresarNombre() {
        String nombre;
        boolean nombreValido = true;

        try {
            System.out.println("Digite el nombre del producto");
            nombre = teclado.nextLine();
            validaci.validarNombre(nombre);
            producto.setNombre(nombre);
            nombreValido = false;
        } catch (NombreInvalidoException e) {
            System.out.println(e.getStackTrace());
        }

    }

    public void ingresarPrecio() {
        double precioProducto;
        boolean precioValido = true;
        try {
            System.out.println("Digite el precio del producto");
            precioProducto = teclado.nextDouble();
            validaci.validarPrecio(precioProducto);
            producto.setPrecio(precioProducto);
            precioValido = false;
        } catch (PrecioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ingresarStock() {
        int stockProducto;
        boolean stockValido = true;
        try {
            System.out.println("Digite la cantidad de stock");
            stockProducto = teclado.nextInt();
            validaci.validarStock(stockProducto);
            producto.setStock(stockProducto);
            stockValido = false;
        } catch (StockInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Iniciar() {
        while (bandera) {
            crearMenu();
            opcion = teclado.nextInt();
            realizarAccion(opcion);
        }
    }

    public void crearMenu() {
        menu = "----------------------------------\n";
        menu += "G E S T I O N  E M P L E  A D O\n";
        menu += "----------------------------------\n";
        menu += "1. Crear producto.\n";
        menu += "2. Listar producto.\n";
        menu += "3. Actualizar producto.\n";
        menu += "4. Eliminar empleado.\n";
        menu += "5. Salir.\n";
        menu += "----------------------------------\n";

        System.out.println(menu);
    }

    public void realizarAccion(int opcion) {
        switch (opcion) {
            case 1:
            ingresarNombre();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                bandera = false;
                break;

            default:
                throw new AssertionError();
        }
    }

}
