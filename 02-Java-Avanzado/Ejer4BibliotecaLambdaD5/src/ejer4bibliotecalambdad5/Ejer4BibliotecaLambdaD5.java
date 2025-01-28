package ejer4bibliotecalambdad5;

import logica.NotificadorLibro;

public class Ejer4BibliotecaLambdaD5 {

    public static void main(String[] args) {

        //Forma clásica (Clase anónima)
        NotificadorLibro notiLibro = new NotificadorLibro() {
            @Override
            public void enviarNotificacion(String mensaje) {
                System.out.println("=*=*=*Notificacion Clasica=*=*=*  " + mensaje);
               // System.out.println("El libro olviddo es " + mensaje);
            }
        };
        //notiLibro.enviarNotificacion("La disponibilidad del libros");

        //Usando lambda
        NotificadorLibro notiLibro2 = (String mensaje) -> {System.out.println("Notificación moderna: " + mensaje);};
        // NotificadorLibro notiLibro2 = (String mensaje) -> {System.out.println("Notificación moderna: " + mensaje);};
        //notiLibro2.enviarNotificacion("La disponibilidad del libros");

        
        //Probar ambos metodos
        notiLibro.enviarNotificacion("Java para Principiantes");
        notiLibro2.enviarNotificacion("Spring Boot");
    }

}
