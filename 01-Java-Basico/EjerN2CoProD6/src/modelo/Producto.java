package modelo;

public class Producto {
//Atributos

    private int codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private float precioCosto;
    private float precioVenta;
    private int cantidadStock;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String marca, String tipo, float precioCosto, float precioVenta, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEl codigo es: ").append(codigo);
        sb.append("\nEl nombre es: ").append(nombre);
        sb.append("\nEl tipo es: ").append(tipo);
        sb.append("\nEl precioCosto es: ").append(precioCosto);
        sb.append("\nEl precioVenta es: ").append(precioVenta);
        sb.append("\nEl cantidadStock es: ").append(cantidadStock).append("\n");
        return sb.toString();
    }

}
