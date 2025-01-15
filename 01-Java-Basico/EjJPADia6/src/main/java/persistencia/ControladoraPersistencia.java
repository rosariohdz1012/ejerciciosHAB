package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    PersonaJpaController persoJpa = new PersonaJpaController();

    public void crearPersona(Persona perso) {
        persoJpa.create(perso);

    }

    public void borrarPersona(int id) {
        try {
            persoJpa.destroy(id);

        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //buscar una sola perosna
    public Persona traerPersona(int id){
        return persoJpa.findPersona(id);
    }



//traer todas las personas
public List<Persona>traerPersona(){
return persoJpa.findPersonaEntities();

}

//persona que llega como parametro es la perosna con los datos nuevos a modificar
public void modificarPersona(Persona pers){
}
//CRUD
/*
            CREATED = ALTA
            READ = LECTURA
            UPDATE = MODIFICACION
            DELETE = BAJA
 */
}