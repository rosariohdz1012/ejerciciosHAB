/*Ejercicio: Clasificación de un artículo en una tienda
Una tienda clasifica los artículos en diferentes categorías según su precio. 
Escribe un programa que, a partir del precio ingresado por el usuario, determine en qué categoría se encuentra el artículo. 
Las categorías son las siguientes:
Si el precio es menor a $50, el artículo se clasifica como "Económico".
Si el precio está entre $50 y $100, el artículo se clasifica como "Accesible".
Si el precio está entre $100 y $200, el artículo se clasifica como "Estándar".
Si el precio es mayor a $200, el artículo se clasifica como "Premium".
El programa debe mostrar un mensaje indicando la categoría correspondiente.*/
package EjercicioTiendaDia2;

import java.util.Scanner;

public class EjercicioTiendaDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el precio del articulo");
        float precio = teclado.nextFloat();

        if (precio < 50) {
            System.out.println("El artículo se clasifica como 'Económico'.");
        } else if (precio > 50 && precio <= 100) {
            System.out.println("eL artículo se clasifica como 'Accecible'.");
        } else if (precio > 100 && precio <= 200) {
            System.out.println("eL artículo se clasifica como 'Estandar'.");
        } else {
            System.out.println("eL artículo se clasifica como 'Premium'.");
        }

    }

}
