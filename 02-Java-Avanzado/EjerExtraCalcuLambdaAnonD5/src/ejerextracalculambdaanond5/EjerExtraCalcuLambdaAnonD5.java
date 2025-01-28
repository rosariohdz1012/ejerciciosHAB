package ejerextracalculambdaanond5;

import logica.Operador;

public class EjerExtraCalcuLambdaAnonD5 {

    public static void main(String[] args) {
        //mediante clases anonimas
        Operador oper = new Operador() {

            @Override
            public void operacion(int a, int b) {
                System.out.println("       CLASES ANÓNIMAS");
                System.out.println("La suma de los digitos es: " + (a + b));
            }
        };
        oper.operacion(9, 7);
 System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
        //mediante lambdas
        Operador oper2 = (a, b) -> {// O (int a, int b)
            System.out.println("       MEDIANTE LAMBDAS");
            System.out.println("La suma de los digitos es: " + (a + b));

        };
        oper2.operacion(8, 6);
    }
}
