package ejer3gimnaciolambdad5;

import logica.NotificadorClase;

public class Ejer3GimnacioLambdaD5 {

    public static void main(String[] args) {

        //mediante clases anonimas
        NotificadorClase notif = new NotificadorClase() {//no va el mensaje por que es una instacia
            @Override
            public void enviarRecordatorio(String mensaje) {
                System.out.println("Recuerde que tiene clases de " + mensaje);

            }

        };//.enviarRecordatorio("Zumba");//una forma
        notif.enviarRecordatorio("Zumba");//segunda forma

        //mediante lambdas
    //parametro + -> + sentencia
    //valor que quiero pasar + funcion flecha -> + codigo que quiero que tenga el metodo
    //declaracion del metodo
    NotificadorClase notif2 = (String mensaje) -> System.out.println("Recuerde que tiene clases de: " + mensaje);
    notif2.enviarRecordatorio("Pilates");
    
    }

}
