package logica;

public abstract class Vehiculo {

    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precio;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double precio) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo" 
                + "\nEl id es: " + id 
                + "\nLa placa es: " + placa 
                + "\nLa marca es: " + marca 
                + "\nEl modelo es: " + modelo 
                + "\nEl anio es: " + anio 
                + "\nEl precio es: " + precio +" dolares";
    }
    
    

    public abstract double calcularAntiguedad();
    
}
