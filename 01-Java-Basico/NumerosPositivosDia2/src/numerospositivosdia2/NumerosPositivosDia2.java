/*Escribe un programa que permita al usuario ingresar números positivos y vaya acumulando la suma de estos. 
El programa debe detenerse cuando el usuario ingrese un número negativo, y en ese momento debe mostrar la suma
total de los números positivos ingresados.
 */
package numerospositivosdia2;

import java.util.Scanner;

public class NumerosPositivosDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here

        int positivo = 0;
        int numero;
        System.out.println("Digite los numeros a sumar, el limite para romper la aplicacion es ingresando numeros negativos");
        while (true) {
            System.out.println("Digite un numero");
            numero = teclado.nextInt();
            if (numero >= 0) {
                positivo += numero;
                System.out.println("El numero es " + numero);
            } else {
                System.out.println("El numero negativo es: " + numero);
                break;
            }
        }

        System.out.println("la suma es: " + positivo);

    }

}
