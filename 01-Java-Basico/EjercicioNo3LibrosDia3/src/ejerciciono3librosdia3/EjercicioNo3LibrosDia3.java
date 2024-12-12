/*-Crear una clase llamada Libro, que tenga los siguientes atributos: codigo ISBN, título, autor, género, número de páginas.
-Construye un objeto de tipo Libro con datos ingresados por teclado por el usuario.
-Muestra por pantalla todos los datos del libro (puedes usar getters o toString)
-Modifica el numero de páginas del libro (usar el método set)
-Mostrar por pantalla los datos modificados del libro
Punto Extra OPCIONAL: Adaptar el código para que permita agregar hasta 5 libros y que CADA LIBRO se asigne a la posición de un vector.*/
package ejerciciono3librosdia3;

import java.util.Scanner;
import logica.Libro;

public class EjercicioNo3LibrosDia3 {

    public static void main(String[] args) {System.out.println("*********** Bienvenido a la Biblioteca Libritos *********** ");
        
        Libro libro = new Libro();
        Scanner teclado = new Scanner (System.in);
        Libro listaLibros[] = new Libro[5];
        
        for (int i=0;i<listaLibros.length;i++) {
            System.out.println("Digite los datos del libro ");
            System.out.println("Código: ");
            libro.setCodigoISBN(teclado.nextInt());
            System.out.println("Título: ");
            teclado = new Scanner (System.in);
            libro.setTitulo(teclado.nextLine());
            System.out.println("Autor: ");
            libro.setAutor(teclado.nextLine());
            System.out.println("Genero: ");
            libro.setGenero(teclado.nextLine());
            System.out.println("Numero de páginas");
            teclado = new Scanner (System.in);
            libro.setNumPaginas(teclado.nextInt());
            
            //guardo libro en vector
            listaLibros[i] = libro;
            
            //reseteo libro y scanner
            libro = new Libro();
            teclado = new Scanner (System.in);
            
            System.out.println("Libro cargado ");

        }
        
        System.out.println("Todos los libros estan arriba");
        System.out.println("===============================");
        System.out.println("Lista de libros :");
        
         for (int i=0;i<5;i++) { 
             System.out.println(listaLibros[i].toString());
         }
        
           
        
    }
    
}