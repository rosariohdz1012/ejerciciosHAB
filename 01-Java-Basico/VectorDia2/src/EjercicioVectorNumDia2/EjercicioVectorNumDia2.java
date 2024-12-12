/*Realizar un programa que permita la carga de 15 números en un vector. 
Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 7.*/
package EjercicioVectorNumDia2;

import java.util.Scanner;

public class EjercicioVectorNumDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion del array
        int numeros[] = new int[15];
        int vecesNum = 0;
        int IngresarNum;
        
        System.out.println("========BIENVENIDO AL SISTEMA.========"
                + "\nSolicitar numeros e informar por pantalla cuántas veces se cargó el número 7 ");
        //Cargar mediante teclado
        System.out.println("Ingrese los 15 numeros  ");
        
             for( int i=0;i<15;i++){
                 numeros[i]=teclado.nextInt();
                 if(numeros[i] == 7){
                     vecesNum++;
                 }
    }
        System.out.println("El numero 7 ya fue ingresado "+vecesNum+" veces");  
}
}
