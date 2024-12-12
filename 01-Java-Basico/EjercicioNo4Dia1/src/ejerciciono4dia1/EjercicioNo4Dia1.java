/*Ejercicio Nº 4 - Operaciones de Lectura
Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos:
suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje
amigable para el usuario.

Sugerencia: Compara los resultados que obtienes con otros compañeros. Pide a tus compañeros que te digan números al azar 
y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.

Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… 
¿De qué manera tratarías de evitar esta situación?

 */
package ejerciciono4dia1;

import java.util.Scanner;

public class EjercicioNo4Dia1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables e inicializacion
        float primerNumero;
        float segundoNumero;
        float suma=0;
        float resta;
        float multiplicacion;
        float division;

        System.out.println("Digite el primer numero entero");
        primerNumero = entrada.nextFloat();
        System.out.println("Digite el segundo numero entero");
        segundoNumero = entrada.nextFloat();
        System.out.println("******************************");

        
        // operaciones
        suma = primerNumero + segundoNumero;
        resta = primerNumero - segundoNumero;
        multiplicacion = primerNumero * segundoNumero;
        division = primerNumero / segundoNumero;
        // impresion
        if(segundoNumero >0){
        System.out.println("El resultado de las operaciones son" + "\n"
                + "El resultado de la suma es: " + suma + "\n"
                + "El resultado de la resta es: " + resta + "\n"
                + "El resultado de la multiplicacion es: " + multiplicacion + "\n"
                + "El resultado de la division es: " + division);
        System.out.println("****************\n"
                + "Felicidades, haz realizado tus operaciones con exito.\n"
                + "Regresa pronto te amo, nunca me olvides");
        }else{
            System.out.println("Digite otro numero diferente a 0");
        }
    }

}
