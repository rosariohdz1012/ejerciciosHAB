package com.hackaboss.logica;

import com.hackaboss.persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class ControladoraLogica {//su responsabilidad es recibir dstos que manda el servelt
    //persistencia crear la persona con persona crear la base de datos guardar esos datos
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPersona(String nombre, String apellido, String telefono) {
        Persona perso = new Persona(nombre, apellido, telefono);
        controlPersis.crearPersona(perso);
    }
    
   public ArrayList<Persona> buscarPorApellido (String busquedaApellido){
       //estoy haciendo el filtrado en la LOGICA
       //esto es MENOS eficiente que si lo hago en la BD
       ArrayList<Persona> personasCoincidentes = new ArrayList<>();
              ArrayList<Persona> listaPersonas = controlPersis.traerPersonas();

              for (Persona perso : listaPersonas) {
                  if (perso.getApellido().equals(busquedaApellido)) {
                      personasCoincidentes.add(perso);
                  }
                   }
              return personasCoincidentes;
       
   }
    
}
