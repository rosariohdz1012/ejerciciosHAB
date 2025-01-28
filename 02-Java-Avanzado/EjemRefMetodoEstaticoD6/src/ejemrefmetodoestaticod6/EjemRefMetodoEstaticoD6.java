package ejemrefmetodoestaticod6;

import java.util.function.Function;

public class EjemRefMetodoEstaticoD6 {

    public static void main(String[] args) {
        //convertir un entero a un String
        //com lambdas
        //(int num) -> String.valueOf(num);
        
        //referencia a metodos
        //String::valueOf;
        
        Function<Integer,String> convertidor = (num) -> String.valueOf(num);//lambda
        //Function<Integer,String> convertidor = String::valueOf;//declarando la interfaz funciona;
        System.out.println("El valor de salida es: " + convertidor.apply(35));
    
    String resultado = String.valueOf(35);
        System.out.println("El valor de salida es: " + resultado);
    
    }
    
}
