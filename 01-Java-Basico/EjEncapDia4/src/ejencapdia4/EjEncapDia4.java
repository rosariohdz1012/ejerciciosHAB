package ejencapdia4;

import logica.Mascota;

public class EjEncapDia4 {

    public static void main(String[] args) {
         Mascota masco = new Mascota();
        masco.setNombre("Ibra");
        masco.getNombre();
        
        //Acceder a un atributo privado sin getters o setters
        //Es necesario cambiar a público
       //String nombre = masco.nombre;     
       //System.out.println(nombre);

    }

}
