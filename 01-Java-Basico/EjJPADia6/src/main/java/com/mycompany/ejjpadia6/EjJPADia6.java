package com.mycompany.ejjpadia6;

import java.util.List;
import logica.Persona;
import persistencia.ControladoraPersistencia;
import persistencia.PersonaJpaController;

public class EjJPADia6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //Creo 3 personas en la BD
        controlPersis.crearPersona(new Persona(1,"Luisina",33));
        controlPersis.crearPersona(new Persona(2,"Esteban",25));
        controlPersis.crearPersona(new Persona(3,"Alejandra",31));
        
        //Obtengo todas las personas
        List<Persona> listaPersonas = controlPersis.traerPersonas();
        for (Persona per : listaPersonas) {
            System.out.println("Persona: " + per.getNombre());
        }
        
        //borramos una persona
        controlPersis.borrarPersona(2);
        
        //modificar la persona
        controlPersis.modificarPersona(new Persona(3, "Alejandra", 45));
    }
}
