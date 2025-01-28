package ejemprografuncionald5;

import java.util.ArrayList;
import java.util.List;

public class EjemPrograFuncionalD5 {

    public static void main(String[] args) {

        List<Integer> listNumeros = new ArrayList<>();

        listNumeros.add(35);
        listNumeros.add(23);
        listNumeros.add(64);

        //recorrer lista
        //nultiplicar por 2 cada numero
        //mostrat por pantalla
        // ala antigua
        //clasico
        System.out.println("=*=*=*=*Clasico*=*=*=*");
        multiplicarNumeros(listNumeros);

        //simplificar esto con lambaas
        System.out.println("*=*=*=*Con Lambdas*=*=*=*");
        listNumeros.forEach(numero -> System.out.println(numero * 2));

    }

    public static void multiplicarNumeros(List<Integer> listaNumeros) {
        for (int numero : listaNumeros) {
            System.out.println(numero * 2);

        }
    }
}
