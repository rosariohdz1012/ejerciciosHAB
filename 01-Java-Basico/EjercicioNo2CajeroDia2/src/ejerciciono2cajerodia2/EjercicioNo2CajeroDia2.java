/*Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total
de la compra que debe abonar. Pista:  Recuerda que existen dos tipos de bucles, los controlados por un contador (cuando sabemos un número exacto de
productos por ejemplo) o por centinela (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar una “centinela”.
Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.*/
package ejerciciono2cajerodia2;

import java.util.Scanner;

public class EjercicioNo2CajeroDia2 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     
     double precio;
     double total=0;
     
     while(true){
         System.out.println("Digite el precio del producto, para finalizar escriba 0");
         precio = teclado.nextDouble();
         
         if(precio <=0){//centinela
             break;
         }
         total +=precio;
     }
        System.out.println("El total de su compra es: "+total);
    }
    
}
