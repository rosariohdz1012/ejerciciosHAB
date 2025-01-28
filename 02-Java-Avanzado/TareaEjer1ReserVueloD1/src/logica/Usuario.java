package logica;

import java.time.LocalDate;

public class Usuario {

    private String nombre;
    private String destino;
    private LocalDate fechaViaje;//
    private int numAsientosDeseados;

    public Usuario() {
    }

    public Usuario(String nombre, String destino, LocalDate fechaViaje, int numAsientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numAsientosDeseados = numAsientosDeseados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumAsientosDeseados() {
        return numAsientosDeseados;
    }

    public void setNumAsientosDeseados(int numAsientosDeseados) {
        this.numAsientosDeseados = numAsientosDeseados;
    }

    @Override
    public String toString() {
        return "=*=*=*=*=*=*RESERVACION*=*=*=*=*=*=\n"
                + "El nombre del cliente es: " + nombre
                + "\nEl destino es: " + destino
                + "\nLa fecha de Viaje es: " + fechaViaje
                + "\nEl numero de asientos deseados es: " + numAsientosDeseados;
    }

}
