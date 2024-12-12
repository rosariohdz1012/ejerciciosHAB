/*Ejercicio Nº 1 - Sintaxis básica
a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario.
Por ejemplo: “Hola, bienvenido al sistema”.
b) Una vez lograda esta primera parte, permita que se almacene el nombre del usuario en una variable y se muestre 
el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenido al sistema”.
 */
package ejerciciono1dia1;

import java.util.Scanner;

public class EjercicioNo1Dia1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Digite su nombre");
        nombre = teclado.nextLine();

        System.out.println("\"Hola " + nombre + ", bienvenido al sistema.\"");

    }

}
