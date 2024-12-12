package ejemplowhiledia2;

import java.util.Scanner;

public class EjemploWhileDIA2 {

    public static void main(String[] args) {
        /* // CREAR UN PROGRAMA QUE CUENTE DE 0 AL 10
        int contador = 0;
        while (contador <= 10) {
            System.out.println("Estoy en el numero: " + contador);
            contador = contador + 1;
           //0 = 0 + 1
           //1 = 1 + 1
           //2 = 2 + 1
           contador = contador + 1;
        }*/
 /*Crear un programa que permita ingresar las edades de personas 
y que pare su ejecusin al encontrar una perosnas mayor a 70 a;os*/
 
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);

        int edad = teclado.nextInt();

        while (edad <= 70) {
            System.out.println("Ingrese su edad");
            edad = teclado.nextInt();
        }
        System.out.println("Persona encontrada");
    }

}
