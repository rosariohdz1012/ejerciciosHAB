/* Ejercicio Nº 2 - Tipos de Datos
a) Crea un programa que declara una variable para cada uno de los siguientes tipos de datos: int ,
double , boolean y String . Asigna un valor a cada variable y muestra su contenido en la consola.
b) Ahora, asigna valores que no corresponden al tipo de dato. Por ejemplo, un int en un String o un String en 
un double … ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
Justificar el por qué de cada caso. Debatir con otros compañeros.
 */
package ejerciciono2dia1;

public class EjercicioNo2Dia1 {

    public static void main(String[] args) {
        int edad = 23;
        double precio = 69.99;
        boolean validacion = true;
        String nombre = "Rosario";

        System.out.println("Tu edad es: " + edad + " \n" + "El precio es: " + precio + " \n"
                + "Tu eaa es: " + validacion + " \n" + "Tu nombre es: " + nombre);

        /* int errEnteroFlotante = 12.6 ; //Genera error porque solo permite numero enteros sin decimal
        float errFlotanteEntero = 3;// No genera error ya se que encuentra dentro del rango
        short errCortoEntero = 500;// No genera error ya se que encuentra dentro del rango establecido utilizando 16 bits
        long errLargoEntero = 10600;//No genera error por el tipo de dato es long ya que utiliza 64 bits
        double errDobleEntero = 60000;
        String errEntero = 1; //Genera error porque solo permite cadenas texto
        double errCadena = "hola"; //Genera error porque solo permite numeros pero con doble precision */
    }

}
