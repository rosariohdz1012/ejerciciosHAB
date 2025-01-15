package logica;

public class Camiseta extends Vestimenta {

    private String manga;
    private String cuello;

    public Camiseta() {
    }

    public Camiseta(String manga, String cuello) {
        this.manga = manga;
        this.cuello = cuello;
    }

    public Camiseta(int codigo, String nombre, float precio, String marca, int talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Esta camiseta es de marca: " + getMarca());
    }

}
