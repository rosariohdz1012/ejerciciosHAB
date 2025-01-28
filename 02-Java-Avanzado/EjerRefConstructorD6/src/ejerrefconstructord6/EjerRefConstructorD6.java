package ejerrefconstructord6;

import java.util.function.BiFunction;
import logica.Persona;

public class EjerRefConstructorD6 {

    public static void main(String[] args) {
    
       //Referencia al constructor
        BiFunction<String,Integer,Persona> constructor = Persona::new;
        
        Persona pers = constructor.apply("Luisina", 33);
        System.out.println(pers);
        
        
        //Forma norma
        Persona per1 = new Persona("Luisisna",33);
        System.out.println(per1);
    }

}
