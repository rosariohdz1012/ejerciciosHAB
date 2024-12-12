/*Ejercicio Nº 1:
Crear una clase que represente a un animal con los atributos nombre, especie y color
Crear un objeto vacio y un objeto con atributos de ese animal*/
package ejerciciono1dia3;

import logica2.Animal;



public class EjercicioNo1AnimalDia3 {
       public static void main(String[] args) {

        Animal anim = new Animal();
        Animal anim2 = new Animal ("Churrumino", "Periquito", "Azul");
        
         System.out.println("El animal es" + " \nNombre: " + anim2.getNombre()+ " \nEspecie: " + anim2.getEspecie()+ " \nColor: " + anim2.getColor() );

           
        
}
}