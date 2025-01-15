package com.mycompany.restaurante;

import com.mycompany.restaurante.logica.Controladora;
import com.mycompany.restaurante.logica.Platillo;
import java.util.List;

public class Restaurante {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        /*Proceso de Altas*/
         Platillo plat1 = new Platillo(1, "Milanesa", "esta es la receta", 15.0);
        control.crearPlatillo(plat1);
        Platillo plat2 = new Platillo(2, "Fideos con salsa", "esta es la receta", 8.0);
        control.crearPlatillo(plat2);

        control.crearPlatillo(new Platillo(3, "Paella", "esta es la receta", 25.0));
        /*Proceso de lectura*/
       // List<Platillo> listaPlatillos = control.traerPlatillos();
        for(Platillo plat:control.traerPlatillos()){
            System.out.println(plat.toString());
            
        }
 
        /*Proceso de eliminacon*/
        
        
 /*Proceso de edicion*/
    }

}
