package ejemploarreglodia2;


import java.util.Scanner;

public class EjemploArregloDia2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[5];
//Cargar vector maualmente
        numeros[0] = 32;
        numeros[1] = 12;
        numeros[2] = 25;
        numeros[3] = 75;
        numeros[4] = 890;
       //Cargar mediante teclado
        System.out.println("Ingrese numeros a guardar ");
        Scanner teclado = new Scanner(System.in);
             for(int i=0;i<=4;i++){
                 numeros[i]=teclado.nextInt();
             }
             //recorrido  de vector
              for(int i=0;i<=4;i++){
                  System.out.println("El valor guardado en la posicion " + i +" es: "+ numeros[i]);
              }
    }

}
