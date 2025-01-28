package logica;
    
public class MiRunnable implements Runnable{
    claseSincronizada ejemplo = new claseSincronizada();
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Soy el hilo: Estoy en la vuelta: " + i);
            ejemplo.incrementar();
            

        }
    
}
}
