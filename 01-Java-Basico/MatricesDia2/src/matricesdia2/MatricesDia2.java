package matricesdia2;

import java.util.Scanner;

/*Ejercicio Extra
En una tabla de 4 filas y  columnas se guardan las notas de 4 alumnos de secundario.
Cada fila corresponde a las notas y al promedio de cada alumno.
Se nececita un programa que permite a un profesor cargar en las 3 primeras posiciones
de cada fila las notas del alumno y que en la ultima columna se calculen los promedios.
Una ves realizado los calculos, se desea mostrar las 3 notas de cada alumno y el promedo 
correspondiente recorriendo la matriz*/
public class MatricesDia2 {

    public static void main(String[] args) {
        // TODO code application logic here
        double nota[][] = new double[4][4];
        double contarCal = 0;
        //carga manual

        //cargar por teclado
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < nota.length; f++) {
            for (int c = 0; c < nota[f].length - 1; c++) {
                System.out.println("Ingrese el valor para el alumno: " + (f + 1) + " nota: " + (c + 1) + ":");
                nota[f][c] = teclado.nextDouble();
                contarCal += nota[f][c];
            }
            nota[f][nota[f].length - 1] = contarCal / (nota[f].length - 1);
            contarCal = 0;
        }
        //impresion
        System.out.println("\n  ++++++++ Notas y promedios ++++++++");
        System.out.println("Alumno\t  Nota 1    Nota 2    Nota 3   Promedio");
        for (int f = 0; f < nota.length; f++) {
           System.out.printf("%-10d",f + 1);
            for (int c = 0; c < nota[f].length; c++) {
                System.out.printf("%-10.2f",nota[f][c]);
            }
        
            System.out.println("");
            }
}

}
