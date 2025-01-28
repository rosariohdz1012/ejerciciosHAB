package ejemhilosd2;

import logica.MiHilo;

public class EjemHilosD2 {

    public static void main(String[] args) {
        // Crear hilos mediante una clase 
        MiHilo hilo1 = new MiHilo("Hilo1");
        MiHilo hilo2 = new MiHilo("Hilo2");
        MiHilo hilo3 = new MiHilo("Hilo3");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

}
