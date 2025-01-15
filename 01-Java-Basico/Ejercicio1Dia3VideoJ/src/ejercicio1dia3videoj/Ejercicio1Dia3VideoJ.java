/*Crear una clase llamada VideoJuego, que tenga los siguientes atributos: codigo, titulo, consola, cantidadJugadores, 
categoría (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
- Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. Crear 5 videojuegos y guardarlos en el vector.
- Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores de los videojuegos 
almacenados.
- Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos de todos los 
videojuegos luego del cambio.
- Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola “Nintendo 64”. 
En caso que no encuentre ninguno, informarlo también por pantalla. (editado) */
package ejercicio1dia3videoj;

import java.util.Scanner;
import logica.VideoJuego;

public class Ejercicio1Dia3VideoJ {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("**********Bienvenido a la sala de video juegos **********");

        //Creacion del vector 
        VideoJuego[] verVideOj = new VideoJuego[5];
        //almacenando 5 videojuesos
        verVideOj[0] = new VideoJuego(34567, "Super Mario", "Nintendo 64", 4, "Aventura");
        verVideOj[1] = new VideoJuego(98761, "Mario Kart 64", "Nintendo 64", 6, "Carreras");
        verVideOj[2] = new VideoJuego(23578, "GoldenEye 007", "Nintendo 64", 8, "Aventura");
        verVideOj[3] = new VideoJuego(95287, "SBanjo-Kazooie", "Nintendo 64", 3, "Plataforma");
        verVideOj[4] = new VideoJuego(36789, "The Legend", "Nintendo 64", 1, "Aventura");
        //Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores de los videojuegos almacenados.
        //for(VideoJuego )
    }

}
