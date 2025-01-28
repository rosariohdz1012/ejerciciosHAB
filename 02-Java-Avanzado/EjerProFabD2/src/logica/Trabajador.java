package logica;

public class Trabajador extends Thread {

    private String nombre;
    private Fabrica fabrica;

    public Trabajador(String nombre, Fabrica fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
    }

    

}


