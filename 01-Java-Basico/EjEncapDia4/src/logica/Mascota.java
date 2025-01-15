package logica;

public class Mascota {

    private String nombre;
    private String especie;
    private String color;
    private String raza;
    private double peso;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, String color, String raza, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
