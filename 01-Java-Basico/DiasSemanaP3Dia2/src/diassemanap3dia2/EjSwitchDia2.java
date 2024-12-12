package diassemanap3dia2;

import java.util.Scanner;

public class EjSwitchDia2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingreso un numero del 1 al 7 para saber que dia de la semana es ");
        int dia = teclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es Domingo");
                break;

            default:
                System.out.println("Ingreso un numero no valido");
                break;
        }
    }

}
