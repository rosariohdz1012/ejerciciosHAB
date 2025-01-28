package ejemhilosrunnabled2;

import logica.MiHilo;

public class EjemHilosRunnableD2 {

    public static void main(String[] args) {
    //Con runnable puede ser herencia multiple interfaz
       Runnable miRunnable = new MiHilo();
       
       
       Thread hilo = new Thread(miRunnable);
       hilo.start();
    }
    
}
