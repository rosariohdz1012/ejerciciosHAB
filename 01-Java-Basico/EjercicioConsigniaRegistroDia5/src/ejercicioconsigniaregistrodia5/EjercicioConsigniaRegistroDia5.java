/*Consigna: Sistema de Registro de Estudiantes y Notas
Eres parte de un equipo que está desarrollando un sistema para gestionar las notas de los estudiantes de una universidad. El sistema debe permitir almacenar las notas de los estudiantes para diferentes materias utilizando un HashMap. Cada estudiante tiene un número de matrícula único, que será la clave del mapa y el valor será su promedio.
Crear un programa que permita hacer esto con un número indeterminado de alumnos ingresados por teclado.
Permitir que el programa pueda buscar un alumno por promedio o por matricula en base a lo que elija el usuario. (editado) */
package ejercicioconsigniaregistrodia5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioConsigniaRegistroDia5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        Map<Long, Double> notas = new HashMap<>();

        StringBuilder menu = new StringBuilder();
        menu.append("🅱🅸🅴🅽🆅🅴🅽🅸🅳🅾 \n");
        menu.append("Menu Principal \n");
        menu.append("1) ingresar alumno \n");
        menu.append("2) buscar alumno \n");
        menu.append("3) salir \n");

        int opcion = 3;

        do {
            System.out.println(menu.toString());
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("ingresar la matricula del alummno:");
                    String matricula = teclado.nextLine();
                    System.out.println("Ingresa el promedio del alummno:");
                    String promedio = teclado.nextLine();

                    break;
                    case 2:
                    

                    break;
                case 3:
                    opcion = 3;

                    break;

                default:
                    throw new AssertionError();
            }
             } while (opcion != 3);


        }

    }


