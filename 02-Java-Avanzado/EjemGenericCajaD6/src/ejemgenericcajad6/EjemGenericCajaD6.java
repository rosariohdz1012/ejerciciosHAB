/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemgenericcajad6;

import logica.Caja;
import logica.Legajo;

/**
 *
 * @author IngRosario
 */
public class EjemGenericCajaD6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Caja<String> cajaString = new Caja<>();
        cajaString.poner("Texto");
        String contenido = cajaString.sacar();
        
         Caja<Integer> cajaInt = new Caja<>();
        cajaInt.poner(15);
       int num = cajaInt.sacar();
       
        Caja<Legajo> cajaLegajo = new Caja<>();
        cajaLegajo.poner(new Legajo(123,"Legajo de emepleado"));
       Legajo legaj = cajaLegajo.sacar();
    }
    
}
