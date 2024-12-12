package demostracionoplectesc;

import java.util.Scanner;

public class DemostracionOpLectEsc {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("***************************************");
        
        System.out.println("Ingrese su estatura");
        double estatura = teclado.nextDouble();
        
        System.out.println("Su nombre estatura es: " + estatura);
        

    }

}
