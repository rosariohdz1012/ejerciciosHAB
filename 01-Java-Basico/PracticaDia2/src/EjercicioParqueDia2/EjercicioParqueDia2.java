/*
Una atracción de parque de diversiones tiene un límite de peso de 100 kg por persona. 
Escribe un programa que, a partir del peso ingresado por un usuario, determine si puede o no subirse a la atracción. 
El programa debe mostrar un mensaje indicando si puede subir o no, y si no puede, debe informar cuántos kilos excede el
límite permitido.*/
package EjercicioParqueDia2;

import java.util.Scanner;

public class EjercicioParqueDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        int peso = teclado.nextInt();

        if (peso <= 100) {
            System.out.println("Felicidades puedes subir a la atraccion");
        } else {
            int limite = peso - 100;
            System.out.println("No puede subir a la atraccion el peso limite es de 100 esta excediendo el peso con " + limite + " kg");
        }
        System.out.println("Gracias por usar nuestro programa");

    }
}
