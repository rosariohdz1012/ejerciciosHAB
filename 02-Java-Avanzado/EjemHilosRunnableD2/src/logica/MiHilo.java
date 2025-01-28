package logica;

public class MiHilo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Soy el Estoy en la segunda vuelta: " + i);

        }

    }
}
