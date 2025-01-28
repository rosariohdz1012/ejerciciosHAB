package logica;

public class Producto {
    
    private int id;
    private String nombre;
    private float precio;
    private int cantDisponible;

    public Producto() {
    }

    public Producto(int id, String nombre, float precio, int cantDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    @Override
    public String toString() {
        StringBuilder informacion = new StringBuilder();
        informacion.append("Id: ").append(String.valueOf(id)).append("\n");
        informacion.append("Nombre: ").append(nombre).append("\n");
        informacion.append("Precio: ").append(String.valueOf(precio)).append("\n");        
        informacion.append("Stock: ").append(String.valueOf(cantDisponible)).append("\n");
        informacion.append("=============================================").append("\n");
        return informacion.toString();
    }
    
    
          
    
}
