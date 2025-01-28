package EjemExcepcionesD1;

import java.util.Scanner;
import logica.ExcepcionDatoIncorrecto;

public class ejemexcepcionesd1 {

    public static void main(String[] args) throws ExcepcionDatoIncorrecto {//puede llegar a arogar

        int dato=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un dato por teclado. El mismo que sea un numero entre 1 y 10");
        dato = teclado.nextInt();
        
        if(dato<=0||dato>=10){
               throw new ExcepcionDatoIncorrecto("Ingreso un valor no valido");//lanzar throw se fuerza
        }        
    }
    
}
