package ejercicioconsigniadia5;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Producto;

public class EjercicioConsigniaDia5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();

        StringBuilder menu = new StringBuilder();
        menu.append("🅱🅸🅴🅽🆅🅴🅽🅸🅳🅾 \n");
        menu.append("Menu Principal \n");
        menu.append("Eliga una opcion\n");
        menu.append("1) Registrar Producto \n");
        menu.append("2) Buscar producto \n");
        menu.append("3) salir \n");

        int opcion = 3;

        do {

            System.out.println(menu.toString());
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar nombre del producto:");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresa la marca del producto");
                    String marca = teclado.nextLine();
                    System.out.println("Ingresa el precio del producto");
                    double precio = Double.parseDouble(teclado.nextLine());

                    listaProductos.add(new Producto(nombre, marca, precio));
                    System.out.println("------------------------");
                    break;
                case 2:

                    System.out.println("Ingresar el nombre del producto");
                    String nombre2 = teclado.nextLine();
                    boolean esEncontrado = false;
                    for (Producto p : listaProductos) {

                        if (p.getNombre().equalsIgnoreCase(nombre2)) {
                            esEncontrado = true;
                            System.out.println("Producto " + nombre2 + " encontrado " + "y su precio es de: " + p.getPrecio());
                        }
                    }
                    
                    if(esEncontrado==false){
                        System.out.println("Producto no encontrado.");
                    }                        
                        

                    break;

                case 3:
                    opcion = 3;

                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcion != 3);
        
        System.exit(0);

    }

}
