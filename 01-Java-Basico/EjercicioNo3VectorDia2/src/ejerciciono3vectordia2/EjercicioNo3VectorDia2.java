/*Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima 
promedio que hubo.Para ello, deberá manejar un vector donde en cada posición se almacene la temperatura máxima correspondiente de cada día.
Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla. */
package ejerciciono3vectordia2;

import java.util.Scanner;



public class EjercicioNo3VectorDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] temperaturas = new double[7];
        double suma = 0;
        double promedio=0;
        //Digitar temperaturas Maximas
        for(int temM = 0;temM<temperaturas.length;temM++){
            System.out.println("Ingresar la temperatura "+(temM+1));
            
            temperaturas[temM] = teclado.nextDouble();
            
            suma += temperaturas[temM];
            
        }
        //promedio
           promedio = suma/temperaturas.length;
           
           System.out.printf("la temperatura máxima promedio es de: %.2f\n", promedio);
    }
    
}
