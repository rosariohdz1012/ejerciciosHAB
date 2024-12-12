/*Crear una clase llamada Fruta, que tenga los siguientes atributos: nombre, color, calorías, tipoCascara, esComestible (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
- Pedirle al usuario por teclado que ingrese los datos de la fruta que quiera guardar.
- Mostrar por pantalla los datos de la fruta creada
- Cambiar un dato de la fruta
- Volver mostrar la fruta con los datos cambiados */
package ejerciciono2frutadia3;

import java.awt.BorderLayout;
import java.util.Scanner;
import logica.Fruta;

public class EjercicioNo2FrutaDia3 {

    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  
        System.out.println("Bienvenido al sistema de fruterias");
        
        Fruta frut = new Fruta();
      
        System.out.println("Ingrese datos de la fruta que desea cargar");
        System.out.println("BIngrese el nombre de la fruta");
        frut.setNombre(teclado.nextLine());//forma avreviada
       /* String NOMBREfRUTA = TECLADO.NEXTLINE
        frut.setNombre(nombrefruta)*/
       
        System.out.println("Ingrese el color de la fruta");  
        frut.setColor(teclado.nextLine());

        System.out.println("Ingrese el tipo de cáscara de la fruta");
        frut.setTipoCascara(teclado.nextLine());
        
        System.out.println("Ingrese las calorías de la fruta");
        teclado = new Scanner(System.in);
        frut.setCalorias(teclado.nextDouble());
        
        System.out.println("¿La fruta es comestible? Ingrese y si es así, o n si no es comestible");
        teclado = new Scanner(System.in);
        String opcion = teclado.next();
        
        if (opcion.equals("y")) {
            frut.setEsComestible(true);
        }
        else {
            frut.setEsComestible(false);
        }
        
        //Mostrar los datos
        
        if (frut.isEsComestible()==true) {
            opcion = "Si";
        }
        else {
            opcion = "No";
        }
        
        System.out.println("La fruta cargada es: " + 
                " Nombre: " + frut.getNombre() + " Color: " + frut.getColor() + " Tipo Cascara: " + frut.getTipoCascara() +
                " Calorias: "  + frut.getCalorias() + "¿Es comestible? " + opcion);
        
        System.out.println("Cambio a 25 calorias");
        frut.setCalorias(25);
        
        System.out.println("Datos después de modificar");
        
        System.out.println(frut.toString());

    }
    
}