package ejerrefmetodoarbitrariod6;

import java.util.ArrayList;
import java.util.List;
import logica.Persona;

public class EjerRefMetodoArbitrarioD6 {
    
    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Carlos"));
        listaPersonas.add(new Persona("Alejandra"));
        listaPersonas.add(new Persona("Pedro"));

        //uso referencia a metodos de isntancia de un objeto arbitrario
        listaPersonas.forEach(Persona::saludar);
        
        //codigo normal
        for (Persona per: listaPersonas) {
            per.saludar();
        }
        
    }
    
}
 