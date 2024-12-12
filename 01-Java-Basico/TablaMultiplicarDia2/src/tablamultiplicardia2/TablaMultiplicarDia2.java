/*2. Escribe un programa que permita al usuario ingresar un número entero positivo y luego imprima la tabla 
de multiplicar de ese número del 1 al 10. */
package tablamultiplicardia2;

import java.util.Scanner;

public class TablaMultiplicarDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        int numero;
           int contar;     
        System.out.println("Digite el numero de la tabla entre 1 y 10");
        numero = teclado.nextInt();
        
        if(numero>0 && numero <=10){
            System.out.println("Tabla de multiplicar " + numero);
        for( contar =1; contar<=10; contar++){
            System.out.println(numero + " x " + contar + " = " + (numero * contar));
        }
    }else{
              System.out.println("Digite un numero positivo dentro del rango");  
                }
       
    }
    
}
