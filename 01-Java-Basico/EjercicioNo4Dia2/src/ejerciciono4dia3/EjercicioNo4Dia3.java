/*Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. 
Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). 
El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
A medida que los asientos se ocupan, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? 
¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra. */
package ejerciciono4dia3;

import java.util.Scanner;

public class EjercicioNo4Dia3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char[][] asientos = new char[5][5];

        //hacientos vacios "O"
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[f].length; c++) {
                asientos[f][c] = 'O';
            }
        }
//Mapa de asientos
        while (true) {
            System.out.println("  Mapa de Asientos");
            for (int f = 0; f < asientos.length; f++) {
                for (int c = 0; c < asientos[f].length; c++) {
                    System.out.print("  " + asientos[f][c] + "");
                }
                System.out.println();
            }
            System.out.println("Digite la fila (1-5):\t");
            int fila = teclado.nextInt() - 1;

            System.out.println("Digite la asiento (1-5):\t");
            int asiento = teclado.nextInt() - 1;//indicar el indice

            if (asientos[fila][asiento] == 'X') {
                System.out.println("El asiento ya esta ocupado, Escoja otro asiento");
            } else {
                asientos[fila][asiento] = 'X';
                System.out.println("Su asiento ha sido reservado");
                System.out.println("-------------------------------------");
            }
            // Preguntar si desea realizar otra reserva
            System.out.println("Quiere realizar otra reserva s/n:");
            char respuesta = teclado.next().charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                break;
            }
        }
        // Mostrar el mapa de asientos final
        System.out.println("Mapa de asientos final:");
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[f].length; c++) {
                System.out.print(asientos[f][c] + " ");

            }
            System.out.println();
        }
    }
}
