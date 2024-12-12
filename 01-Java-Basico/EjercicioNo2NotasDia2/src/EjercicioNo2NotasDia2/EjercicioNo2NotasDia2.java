/*Ejercicio Nº 2
        Una universidad clasifica las notas de los estudiantes en diferentes niveles de rendimiento.
        Escribe un programa que, a partir de una nota numérica ingresada por el usuario, determine el
        nivel de rendimiento del estudiante. Las categorías son las siguientes:
            Si la nota es menor a 60, el rendimiento es "Insuficiente".
            Si la nota está entre 60 y 80, el rendimiento es "Bueno".
            Si la nota está entre 81 y 90, el rendimiento es "Notable".
            Si la nota es mayor a 90, el rendimiento es "Excelente".*/
package EjercicioNo2NotasDia2;

import java.util.Scanner;

public class EjercicioNo2NotasDia2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la nota que determina el rendimiento del estudiante entre 10 a 100");
        float nota = teclado.nextFloat();

        if (nota < 60) {
            System.out.println("La nota del alumno es: 'Insuficiente'.");
        } else if (nota > 60 && nota <= 80) {
            System.out.println("La nota del alumno es: 'Bueno'.");
        } else if (nota > 81 && nota <= 90) {
            System.out.println("La nota del alumno es: 'Notable'.");
        } else if (nota > 90 & nota <= 100){
            System.out.println("La nota del alumno es: 'Excelente'.");
        }else{
            System.out.println("Digite una nota dentro del rango ");
        }
    }
    
}
