package ejemploif;

import java.util.Scanner;

public class EjemploIF {

    public static void main(String[] args) {
        // AVISAR SI UNA PEROSNA ES MAYOR DE EDAD 0 NO )mayor es quien tiene 18 años o mas
        System.out.println("Ingrese su edad para saber si es mayor");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Felicidades eres mayor de edad");
        } else {
            System.out.println("No cumples con la edad solicitada");
        }
        System.out.println("Gracias por usar nuestro programa");

    }

}
