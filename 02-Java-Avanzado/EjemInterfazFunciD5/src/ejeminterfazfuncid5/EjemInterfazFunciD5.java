package ejeminterfazfuncid5;

import logica.Mensajero;

public class EjemInterfazFunciD5 {

    public static void main(String[] args) {
        //mediante clases anonimas
        Mensajero mensaje = new Mensajero() {
            @Override
            public void emitirMensaje(String nombre) {
                System.out.println("Hola " + nombre + " desde mi clase anonima");
            }

        };

        mensaje.emitirMensaje("Rosario");

        //lambdas
        Mensajero mensajeLambda = (nombre) -> {System.out.println("Hola " +nombre +" desde Lambda");};
        mensajeLambda.emitirMensaje("Rosario");
    }

}
