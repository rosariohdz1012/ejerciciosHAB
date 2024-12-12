
package ejclasedia3;

import java.time.LocalDate;
import java.time.Month;
import logica.Persona;

public class EjCLaseDia3 {

    public static void main(String[] args) {
        // se tiene acceso a todo perspna
        Persona perso = new Persona();
          Persona perso2 = new Persona (1,"Rosario", "hernandez", 
          LocalDate.of(2024, 12 , 11), "Hola123");
     
          System.out.println("---ANTES----");
System.out.println("El nombre es: " + perso2.getNombre()+"El apellido es: "+perso2.getApellido()+
        "La direccion es: " +perso2.getDireccion());
    
System.out.println("---DESPUES----");
perso2.setNombre("Rosario");

        System.out.println("");
  System.out.println("El nombre es: " + perso2.getNombre()+"El apellido es: "+perso2.getApellido()+
        "La direccion es: " +perso2.getDireccion());
    }

  
    
}
