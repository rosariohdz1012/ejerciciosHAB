/*
 Ejercicio Nº 3 - Variables y Operadores
Escribe un programa que permita calcular el área de un triángulo y luego muestre el resultado por pantalla.
Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividida dos).
Pista:  Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego
calcular el área utilizando la fórmula.
 */
package ejerciciono3dia1;

public class EjercicioNo3Dia1 {

    public static void main(String[] args) {
        // Declaracion de variables e inicializacion
        double base = 5.7;
        double altura = 12.5;
        double area;
        // operaciones
        area = (base * altura) / 2;
        // impresion
        System.out.println("El area de un triangulo es: " + area);

    }

}
