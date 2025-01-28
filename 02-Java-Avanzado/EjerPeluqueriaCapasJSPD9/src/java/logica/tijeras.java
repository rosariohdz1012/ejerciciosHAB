package logica;

import java.time.LocalDate;

public class tijeras {

    private long codigo_insumo;
    private String nombre;
    private int cantidad;
    private LocalDate fechaCaducidad;

    public tijeras() {
    }

    public tijeras(long codigo_insumo, String nombre, int cantidad, LocalDate fechaCaducidad) {
        this.codigo_insumo = codigo_insumo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getCodigo_insumo() {
        return codigo_insumo;
    }

    public void setCodigo_insumo(long codigo_insumo) {
        this.codigo_insumo = codigo_insumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "tijeras{" + "codigo_insumo=" + codigo_insumo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

    
    
    
    
}
