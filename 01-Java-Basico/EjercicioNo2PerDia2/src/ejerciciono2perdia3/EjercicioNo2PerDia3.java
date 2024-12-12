/*Crea una clase Persona , que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).


c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/
package ejerciciono2perdia3;

import logica.Persona;

public class EjercicioNo2PerDia3 {

    public static void main(String[] args) {
        // a) Crear un vector de tipo Persona cinco posiciones. Crea cinco personas y guárdalas en él.
        Persona[] personas = new Persona[5];
        personas[0] = new Persona(1, "Juan", 25, "Calle oriente 1", "123456789");
        personas[1] = new Persona(2, "Ana", 32, "Calle aldame 32", "287654321");
        personas[2] = new Persona(3, "Luis", 28, "Calle norte 13", "45689123");
        personas[3] = new Persona(4, "Marta", 35, "Calle benito juarez 4", "789123456");
        personas[4] = new Persona(5, "Carlos", 40, "Calle 5 de mayo", "321654987");

//        b) Mostrar el nombre y edad 
        System.out.println("Nombres y edades de las personas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
// c) Cambiar el nombre de dos personas
        System.out.println("++++++++++++ANTES++++++++++++:");
        System.out.println("Persona 1: " + personas[0].getNombre());
        System.out.println("Persona 2: " + personas[1].getNombre());

        // Cambiar nombres
        personas[0].setNombre("Juanito");
        personas[1].setNombre("Anita");

        System.out.println("++++++++++++DESPUES++++++++:");
        System.out.println("Persona 1: " + personas[0].getNombre());
        System.out.println("Persona 2: " + personas[1].getNombre());

        // d) personas con edad de 30 años
        System.out.println("Mayores de 30 años:");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
    }
}
   