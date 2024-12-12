/*Un considerando permite únicamente el ingreso de mayores de 18 años. 
Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona
puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.*/
package ejerciciono1dia2;

import java.util.Scanner;

public class EjercicioNo1Dia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        
        System.out.println("Digite la edad su edad");
        edad = teclado.nextInt();
        
        if(edad >= 18){
            System.out.println("Felicidades, Puedes accerder al evento ");
        }else{
            System.out.println("Lo siento, no puedes acceder al evento");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
